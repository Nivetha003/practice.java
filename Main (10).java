import java.util.Scanner;
class ATMAccount{
    private double balance;
    
   void setbalance (double bal){
    balance = bal;
    
}
public void withdraw(double amount){
    if(amount<=0){
        System.out.println("Invalid withdrawal amount");
    }
    else if(balance - amount>=1000){
        balance = balance-amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: "+ balance);
    }
    else{
        System.out.println("not have sufficient balance");
    }
  }
} 
public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Account Balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw Amount: ");
        double amount = sc.nextDouble();
        
        ATMAccount acc = new ATMAccount();
        
        acc.setbalance(balance);
        acc.withdraw(amount);
    }
}