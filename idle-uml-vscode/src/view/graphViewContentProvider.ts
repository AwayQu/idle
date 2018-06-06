'use strict';

import * as vscode from 'vscode';
import { Disposable } from 'vscode';
import * as fs from 'fs';
import * as path from 'path';

export class GraphViewContentProvider extends Disposable implements vscode.TextDocumentContentProvider {
    private _onDidChange = new vscode.EventEmitter<vscode.Uri>();
    private lastUri!: vscode.Uri;
    private serverPort!: number;
    constructor() {
        super(() => { });
        this.ServerPort = 8080;
    }
    public dispose() {
    }
    public set ServerPort(value: number) {
        this.serverPort = value;
    }


    public update(uri: vscode.Uri) {
        this._onDidChange.fire(uri);
    }


    public provideTextDocumentContent(uri: vscode.Uri, token: vscode.CancellationToken): Thenable<string> {
        this.lastUri = uri;
        const editor = vscode.window.activeTextEditor;
        if (!editor || !editor.document) {
            console.log("no active editor");
            console.log(editor);
            // pass
        } else {
            const text = editor.document.getText();
            const filename = editor.document.fileName;
            // console.log(text);
            console.log("find active editor");
            console.log(filename);
            console.log(editor.document.uri.path);

            // check if there is no selection
            if (editor.selection.isEmpty) {
                // the Position object gives you the line and character where the cursor is
                const position = editor.selection.active;
                console.log(position);
                // move cursor to this new position?
                // var newPosition = position.with(position.line, 0);

            } else {
                console.log(editor.selection);
            }
        }




        return this.createHTML();
    }

    get onDidChange(): vscode.Event<vscode.Uri> {
        return this._onDidChange.event;
    }

    private createHTML(): Promise<string> {

        let timeNow = new Date().getTime();
        const htmlContent = `
            <!DOCTYPE html>
            <head>
                <style>
                    html, body { height: 100%; width: 100%; }
                    body { margin: 0; padding: 0; }
                </style>
                <script>
                    function start() {
                        console.log('reloaded results window at time ${timeNow}ms');
                        var color = '';
                        var fontFamily = '';
                        var fontSize = '';
                        var theme = '';
                        var fontWeight = '';
                        try {
                            computedStyle = window.getComputedStyle(document.body);
                            color = computedStyle.color + '';
                            backgroundColor = computedStyle.backgroundColor + '';
                            fontFamily = computedStyle.fontFamily;
                            fontSize = computedStyle.fontSize;
                            fontWeight = computedStyle.fontWeight;
                            theme = document.body.className;
                        } catch(ex) { }
                        document.getElementById('myframe').src = 'http://localhost:${this.serverPort}/?theme=' + theme + '&color=' + encodeURIComponent(color) + "&backgroundColor=" + encodeURIComponent(backgroundColor) + "&fontFamily=" + encodeURIComponent(fontFamily) + "&fontWeight=" + encodeURIComponent(fontWeight) + "&fontSize=" + encodeURIComponent(fontSize);
                    }
                </script>
            </head>
            <body onload="start()">
                <iframe id="myframe" frameborder="0" style="border: 0px solid transparent; height:100%; width:100%;" src="" seamless></iframe>
            </body>
            </html>`;
        return Promise.resolve(htmlContent);
    }
}
