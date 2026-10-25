# Eight Java OOP Concepts with Real-Life Analogies

## 1. Class
A class is a blueprint that defines fields and methods.
**Analogy:** A house plan describes how houses may be built; the plan itself is not a physical house.
**Java clue:** `class Student { String name; }`

## 2. Object
An object is a particular instance of a class with its own state.
**Analogy:** Two houses built from one plan can have different owners and colours.
**Java clue:** `Student s = new Student();`

## 3. Encapsulation
Encapsulation keeps internal state controlled and exposes safe operations.
**Analogy:** A bank account does not let customers directly edit its stored balance; they use deposit and withdraw operations.
**Java clue:** `private double balance;` plus validated methods.

## 4. Abstraction
Abstraction exposes what an operation does while hiding how it is done.
**Analogy:** A person drives a car using steering and pedals without needing to know every engine detail.
**Java clue:** An interface or abstract class.

## 5. Inheritance
Inheritance lets a subclass extend a superclass.
**Analogy:** A `SavingsAccount` is a specialized kind of `BankAccount`.
**Java clue:** `class SavingsAccount extends BankAccount`

## 6. Polymorphism
Polymorphism lets a common type represent objects with different behaviors.
**Analogy:** The instruction “make a sound” produces a different sound for a dog and a cat.
**Java clue:** `Animal a = new Dog(); a.sound();`

## 7. Interface
An interface defines a contract that implementing classes must fulfill.
**Analogy:** A charger standard describes the connection a compatible device must provide.
**Java clue:** `class Printer implements Printable`

## 8. Composition
Composition builds a larger object from other objects.
**Analogy:** A computer contains components such as a processor and memory.
**Java clue:** A `Car` has an `Engine` field.

## Related ideas
- **Constructor:** Initializes a new object.
- **Method overloading:** Same method name, different parameter lists.
- **Method overriding:** Subclass supplies its own version of an inherited instance method.
- **`this`:** Refers to the current object.
- **`static`:** Belongs to the class rather than an individual instance.
