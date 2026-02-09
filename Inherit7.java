import java.util.Scanner;
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }
}
class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }
    void applyPenalty() {
        if (balance < 5000) {
            System.out.println("Penalty Applied");
            balance -= 500;
        }
    }
    void displayBalance() {
        System.out.println("Final Balance: " + balance);
    }
}    
public class Inherit7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        CurrentAccount ca = new CurrentAccount(balance);
        ca.applyPenalty();
        ca.displayBalance();
    }
}



