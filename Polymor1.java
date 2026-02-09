import java.util.Scanner;
class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    double calculateinterest(){
        return 0 ;
    }
}
class SavingAccount extends Account{
    SavingAccount(double balance){
        super(balance);
 
    }
    double calculateinterest(){
        return balance*0.05;
    }
}
class FixedDeposite extends Account{
    FixedDeposite(double balance){
        super(balance);
    }
    double calculateinterest(){
        return balance*0.10;
    }
}
public class Polymor1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        Account acc1 = new SavingAccount(balance);
        System.out.println("Saving Account: "+acc1.calculateinterest());

        Account acc2 = new FixedDeposite(balance);
        System.out.println("Fixed Deposite: "+acc2.calculateinterest());
    }
}
    

