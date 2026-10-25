# 20 Java OOP Exercises with Solutions

Try each exercise before reading the solution. The solutions are short model answers; understand and adapt them.

## 1. Class and object
**Task:** Create a `Book` class with a title field and print one book's title.
**Solution:**
```java
class Book {
    String title;
}
class Main {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Basics";
        System.out.println(b.title);
    }
}
```

## 2. Two objects
**Task:** Create two `Student` objects with different names.
**Solution:** Create two instances using `new Student()` and assign a different `name` to each.

## 3. Constructor
**Task:** Add a constructor that accepts a person's name.
**Solution:**
```java
class Person {
    String name;
    Person(String name) { this.name = name; }
}
```

## 4. Encapsulation
**Task:** Make a balance private and expose a getter.
**Solution:** Declare `private double balance;` and add `public double getBalance() { return balance; }`.

## 5. Validation
**Task:** Prevent a negative deposit.
**Solution:** In `deposit(double amount)`, add to the balance only when `amount > 0`.

## 6. Inheritance
**Task:** Create `Dog` as a subclass of `Animal`.
**Solution:** `class Dog extends Animal { }`

## 7. Override
**Task:** Override `sound()` in `Dog`.
**Solution:**
```java
@Override
void sound() { System.out.println("Woof"); }
```

## 8. Polymorphism
**Task:** Store a `Dog` in an `Animal` variable and call `sound()`.
**Solution:** `Animal a = new Dog(); a.sound();`

## 9. Overloading
**Task:** Write `add(int,int)` and `add(double,double)`.
**Solution:** Define both methods with the same name but different parameter types.

## 10. Abstract class
**Task:** Create an abstract `Shape` with `area()`.
**Solution:** `abstract class Shape { abstract double area(); }`

## 11. Implement an abstract method
**Task:** Make `Circle` extend `Shape`.
**Solution:** Implement `area()` in `Circle`, returning `Math.PI * radius * radius`.

## 12. Interface
**Task:** Create `Printable` with `void print()`.
**Solution:** `interface Printable { void print(); }`

## 13. Implement interface
**Task:** Make `Report` implement `Printable`.
**Solution:** `class Report implements Printable { public void print() { System.out.println("Report"); } }`

## 14. Composition
**Task:** Let a `Car` contain an `Engine`.
**Solution:** Declare `private Engine engine = new Engine();` inside `Car` and delegate `start()` to `engine.start()`.

## 15. `this`
**Task:** Explain `this.name = name`.
**Solution:** The left side refers to the current object's field; the right side is the constructor parameter.

## 16. Static field
**Task:** Count how many objects were created.
**Solution:** Use a `static int count` and increment it in the constructor.

## 17. Final field
**Task:** Make a constant `PI` field.
**Solution:** `static final double PI = 3.14159;`

## 18. Access modifiers
**Task:** Which modifier restricts direct access to the declaring class?
**Solution:** `private`.

## 19. Overloading or overriding?
**Task:** A subclass redefines an inherited `display()` with the same signature. Name the concept.
**Solution:** Method overriding.

## 20. Design choice
**Task:** Should a `Car` extend `Engine`, or contain an `Engine`?
**Solution:** Usually contain an `Engine`: a car has an engine rather than being an engine. This is composition.
