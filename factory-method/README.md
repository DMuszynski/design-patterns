# Factory Method

| Layout         | Title          | Module         | Category        | Tags                |
|:--------------:|:--------------:|:--------------:|:---------------:|:-------------------:|
| Design Pattern | Factory Method | factory-method | Creational      | Gang of Four (GoF)  |

<h2>Description</h2>
In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.<br><br>

<p align="center">
    <img src="etc/factoryMethodExample.png" width="600" />
</p>

<h2>Program example</h2>
The following program is an implementation abstract factory pattern
used for the production of modern and Victorian furniture (chair, sofa and table).

<h2></h2>

<h2>Applicability</h2>

Use the Factory Method pattern when

- you don’t know beforehand the exact types and dependencies of the objects your code should work with.
- you want to provide users of your library or framework with a way to extend its internal components.
- you want to save system resources by reusing existing objects instead of rebuilding them each time.

<h2>Consequences</h2>

- Eliminates the need to bind application specific classes into your code
- Provides hooks for subclasses: the factory method gives subclasses a hook for providing an extended version of an object
- Connects parallel class hierarchies: a clients can use factory methods to create a parallel class hierarchy (parallel
class hierarchies appear when objects delegate part of their responsibilities to another class)

