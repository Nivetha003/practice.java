import java.util.Scanner;
class MobileRecharge {
    private int balance;
    private int validity;
    public void setDetails(int bal, int val) {
        balance = bal;
        validity = val;
    }
    public void recharge(int amount) {
        if (amount >= 100) {
            balance = balance + amount;
            validity = validity + 28;
            System.out.println("Recharge Successful");
            System.out.println("Balance: " + balance);
            System.out.println("Validity: " + validity + " days");
        } else {
            System.out.println("Recharge Failed");
        }
    }
}
public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rechargeAmount = sc.nextInt();
        MobileRecharge mr = new MobileRecharge();
        mr.setDetails(0, 0); 
        mr.recharge(rechargeAmount);
    }
}
