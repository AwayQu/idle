# idle

Parse source code (Objective-C) to UML(Class Diagram) file format of plantuml.


# Example

## AFNetworking Class Diagram
![AFNetworking](https://raw.githubusercontent.com/AwayQuEM/idle/master/imgs/AFNetworking.png)


# Usage

```shell

# parse code to generate plantuml file
java -jar idlecommand-1.0-SNAPSHOT-jar-with-dependencies.jar analyze -p path/to/project -o output.puml

# parse plantuml file to png
java -DPLANTUML_LIMIT_SIZE=30000 -jar plantuml.jar output.puml

```
