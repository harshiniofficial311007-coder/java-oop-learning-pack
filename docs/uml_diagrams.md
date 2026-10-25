# UML Class Diagrams

These are simplified text UML diagrams for the example programs. In UML, `+` means public and `-` means private.

## 1. Inheritance and overriding
```text
        +------------------+
        |      Animal      |
        +------------------+
        | + sound(): void  |
        +------------------+
                 ^
                 |
        +------------------+
        |       Dog        |
        +------------------+
        | + sound(): void  |
        +------------------+
```

## 2. Encapsulation
```text
+----------------------------+
|         BankAccount        |
+----------------------------+
| - balance: double          |
+----------------------------+
| + deposit(amount): void    |
| + getBalance(): double     |
+----------------------------+
```

## 3. Interface implementation
```text
+---------------------+       +--------------------+
| <<interface>>       |       |       Printer      |
|      Printable      |<......|--------------------|
+---------------------+       | + print(): void    |
| + print(): void     |       +--------------------+
+---------------------+
```

## 4. Composition
```text
+------------------+      contains      +------------------+
|       Car        |◆------------------|      Engine      |
+------------------+                   +------------------+
| - engine: Engine |                   | + start(): void  |
+------------------+                   +------------------+
| + start(): void  |
+------------------+
```
