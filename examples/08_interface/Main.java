// Topic: Interfaces
interface Printable {
    void print();
}
class Report implements Printable {
    public void print() {
        System.out.println("Printing report");
    }
}
public class Main {
    public static void main(String[] args) {
        Printable p = new Report();
        p.print();
    }
}
// Expected output: Printing report
