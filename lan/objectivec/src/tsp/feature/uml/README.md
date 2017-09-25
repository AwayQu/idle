


# command of generate uml png
```

java -DPLANTUML_LIMIT_SIZE=30000 -jar plantuml.jar ../test/res/out/plantuml/projectTest1.puml  

```


```
impl of plant uml

GenericType -> DependencyType 

DependencyType 
	implements
		getClassElement      
		getClassRelationShip


ClassDiagram -> ClassElement  implements UMLTextDescription
ClassDiagram -> ClassRelaionship implements UMLTextDescription


```