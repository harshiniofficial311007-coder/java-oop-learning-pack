// Topic: Static and final
class Ticket {
    static int count = 0;
    final int number;
    Ticket(int number) {
        this.number = number;
        count++;
    }
}
public class Main {
    public static void main(String[] args) {
        new Ticket(101);
        new Ticket(102);
        System.out.println("Tickets created: " + Ticket.count);
    }
}
// Expected output: Tickets created: 2
