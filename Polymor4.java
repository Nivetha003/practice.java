import java.util.Scanner;
class User{
    double amount;
    User(double amount){
        this.amount = amount;
    }
    double calculatediscount(){
        return 0;
    }
}
class RegularUser extends User{
    RegularUser(double amount){
        super(amount);
        
    }
    double calculatediscount(){
        return amount - (amount*0.05);
    }
}
class PremiumUser extends User{
    PremiumUser(double amount){
        super(amount);
        
    }
    double calculatediscount(){
        return amount - (amount*0.20);
        
    }
}

public class Polymor4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        User us1 = new RegularUser(amount);
        User us2 = new PremiumUser(amount);
        System.out.println("Final Amount: "+(int)us1.calculatediscount());
        System.out.println("Final Amount: "+(int)us2.calculatediscount());
}
}