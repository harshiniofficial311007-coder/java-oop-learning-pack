// Topic: Encapsulation
class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.deposit(-20);
        System.out.println(account.getBalance());
    }
}
// Expected output: 500.0
