// Topic: Runtime polymorphism and overriding
class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Woof"); }
}
class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow"); }
}
public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.sound();
        b.sound();
    }
}
// Expected output:
// Woof
// Meow
