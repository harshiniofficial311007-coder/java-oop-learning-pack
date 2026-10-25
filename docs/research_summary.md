# Research Summary: Java Object-Oriented Programming

**Audience:** Second-year CSE students

## Purpose
Object-oriented programming (OOP) organizes software around classes and objects. A class describes data and behavior; an object is an instance created from a class. OOP can help structure programs into understandable, reusable components.

## Core findings
1. **Classes and objects:** A class is a blueprint; objects are individual instances with state and behavior.
2. **Encapsulation:** Keep an object's internal state controlled, commonly by using `private` fields and public methods.
3. **Abstraction:** Expose essential operations while hiding implementation details. Java supports abstraction through abstract classes and interfaces.
4. **Inheritance:** A subclass can extend one superclass and reuse or specialize its behavior.
5. **Polymorphism:** A superclass or interface reference can refer to different implementation objects; overridden instance methods are selected at runtime.
6. **Overloading and overriding:** Overloading uses the same method name with different parameter lists; overriding provides a subclass implementation of an inherited instance method.
7. **Interfaces:** An interface defines a contract that implementing classes agree to fulfill.
8. **Composition:** One object contains or uses another object to build a larger behavior.

## Common beginner misconceptions to check
- A class and an object are not the same thing.
- Encapsulation is more than simply creating getters and setters; it is about protecting invariants and controlling access.
- Java classes can extend only one class, but can implement multiple interfaces.
- Overloading is resolved using the method signature at compile time; overriding enables runtime polymorphism.
- An interface is not the same as a class, although both help define types.

## Research method and verification
This summary is an initial AI-assisted draft. Compare it with Oracle's Java tutorials, the current Dev.java learning materials, and your university notes. Record any correction you make and cite the exact source you consulted in the final report.

## Sources
- Oracle Java Tutorials, “Object-Oriented Programming Concepts”: https://docs.oracle.com/javase/tutorial/java/concepts/
- Dev.java, “Object-Oriented Programming”: https://dev.java/learn/language/oop/
- Oracle, “Lesson 8: Object-Oriented Programming”: https://www.oracle.com/java/technologies/oop.html

The Oracle Java Tutorials page notes that its examples were written for JDK 8; use current Dev.java documentation where newer language details matter.
