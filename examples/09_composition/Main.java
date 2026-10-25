// Topic: Composition
class Engine {
    void start() { System.out.println("Engine started"); }
}
class Car {
    private Engine engine = new Engine();
    void start() {
        engine.start();
        System.out.println("Car is ready");
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
// Expected output:
// Engine started
// Car is ready
