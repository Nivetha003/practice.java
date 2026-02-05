import java.util.Scanner;
class Wallet {
    private int balance;
    public void setBalance(int bal) {
        balance = bal;
    }
    public void addMoney(int amount) {
        balance = balance + amount;
        System.out.println("Money added successfully");
        System.out.println("Wallet Balance: " + balance);
    }
    public void purchase(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Purchase successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int walletBalance = sc.nextInt();
        int purchaseAmount = sc.nextInt();
        Wallet w = new Wallet();
        w.setBalance(walletBalance);
        w.purchase(purchaseAmount);
    }
}
