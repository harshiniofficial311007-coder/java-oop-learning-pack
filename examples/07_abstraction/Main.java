// Topic: Abstraction with abstract class
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }
    @Override
    double area() { return Math.PI * radius * radius; }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(2);
        System.out.printf("%.2f%n", shape.area());
    }
}
// Expected output: 12.57
