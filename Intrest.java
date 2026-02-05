import java.util.Scanner;
class BankAccount {
    private int balance;
    public void setBalance(int bal) {
        balance = bal;
    }
    public void calculateInterest() {
        int interest;
        if (balance >= 10000) {
            interest = (balance * 6) / 100;
        } else {
            interest = (balance * 4) / 100;
        }
        int finalBalance = balance + interest;
        System.out.println("Interest: " + interest);
        System.out.println("Final Balance: " + finalBalance);
    }
}
public class Intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        BankAccount acc = new BankAccount();
        acc.setBalance(bal);
        acc.calculateInterest();
    }
}
