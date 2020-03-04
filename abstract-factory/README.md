# Abstract Factory

| Layout  | Title            | Module           | Category        | Tags                |
|:-------:|:----------------:|:----------------:|:---------------:|:-------------------:|
| Pattern | Abstract Factory | abstract-factory | Creational      | GoF |

The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client doesn't know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.<br><br>

<p align="center">
    <img src="etc/abstractFactoryExample.png" width="600" />
</p>


<h2>Class Diagram</h2><br>

<img src="etc/abstractFactory.png"/>

<h3>Program example</h3>

```java
/**
 * Abstract product - Chair interface
 */
public interface Chair {
    String getDescription();
}
```

```java
/**
 * Abstract product - Sofa interface
 */
public interface Sofa {
    String getDescription();
}
```
