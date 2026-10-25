// Topic: Constructors and this
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Kavin");
        System.out.println(s.name);
    }
}
// Expected output: Kavin
