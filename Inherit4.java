import java.util.Scanner;
class BankAccount{
    protected double balance;
    BankAccount(double balance){
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount{
    double interest;
    SavingsAccount(double balance, double interest){
        super(balance);
        this.interest = interest;
    }
    public double calculateinterest(){
        return balance*(interest/100);
    }
}
public class Inherit4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Balance: ");
        double balance = sc.nextDouble();
        double interest = sc.nextDouble();
        SavingsAccount save = new SavingsAccount(balance,interest);
        double amount = save.calculateinterest();
        double total = balance+amount;

        System.out.println("Interest: "+save.calculateinterest());
        System.out.println("Final Balance: "+ total);
        
    }
}