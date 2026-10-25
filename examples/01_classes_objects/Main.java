// Topic: Class and object
class Student {
    String name;
    void introduce() {
        System.out.println("Hello, I am " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Anu";
        student.introduce();
    }
}
// Expected output: Hello, I am Anu
