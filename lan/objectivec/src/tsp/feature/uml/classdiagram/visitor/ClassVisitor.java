package tsp.feature.uml.classdiagram.visitor;

import org.antlr.v4.runtime.tree.RuleNode;
import tsp.gen.ObjectiveCParser;
import tsp.gen.ObjectiveCParserBaseVisitor;

public class ClassVisitor extends ObjectiveCParserBaseVisitor<String> {

    private boolean shouldVisit = true;


    @Override
    public String visitClassInterface(ObjectiveCParser.ClassInterfaceContext ctx) {
        System.out.println("className:" + ctx.classNameGeneric().className().getText());
        System.out.println("superClass:" + ctx.superclassName().getText());
        for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
            System.out.println("protocol:" + name.getText());
        }
        return super.visitClassInterface(ctx);
    }


    @Override
    public String visitCategoryInterface(ObjectiveCParser.CategoryInterfaceContext ctx) {
        System.out.println("className:" + ctx.classNameGeneric().className().getText());
        System.out.println("categoryName:" + (ctx.categoryName() != null ? ctx.categoryName().getText() : null));
        for (ObjectiveCParser.ProtocolNameContext name : ctx.protocolReferenceList().protocolList().protocolName()) {
            System.out.println("protocol:" + name.getText());
        }
        return super.visitCategoryInterface(ctx);
    }
}

