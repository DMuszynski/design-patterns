# Builder

| Layout         | Title          | Module         | Category        | Tags                |
|:--------------:|:--------------:|:--------------:|:---------------:|:-------------------:|
| Design Pattern | Builder        | builder        | Creational      | Gang of Four (GoF)  |

<h2>Description</h2>
The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation. It is one of the Gang of Four design patterns.<br><br>

<p align="center">
    <img src="etc/factoryMethodExample.png" width="600" />
</p>

<h2>Program example</h2>


<h2>Class Diagram</h2>

<h2>Applicability</h2>

Use the Builder pattern when

- the algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
- the construction process must allow different representations for the object that's constructed

<h2>Consequences</h2>

- Eliminates the need to bind application specific classes into your code
- Provides hooks for subclasses: the factory method gives subclasses a hook for providing an extended version of an object
- Connects parallel class hierarchies: a clients can use factory methods to create a parallel class hierarchy (parallel
class hierarchies appear when objects delegate part of their responsibilities to another class)

