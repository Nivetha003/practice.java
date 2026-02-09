import java.util.Scanner;
class Insurance{
    double amount;
    Insurance(double amount){
        this.amount = amount;
    }
    double calculatePremium(){
        return 0;
    }
}
class HealthInsurance extends Insurance{
    HealthInsurance(double amount){
        super(amount);
    }
    double calculatePremium(){
        return amount*0.08;
    }
}
class LifeInsurance extends Insurance{
    LifeInsurance(double amount){
        super(amount);
    }
    double calculatePremium(){
        return amount*0.12;
    }
}
public class Polymor2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double amount= sc.nextDouble();
        Insurance ins;
        ins= new HealthInsurance(amount);
        System.out.println("Health Insurance Premium: "+(int)ins.calculatePremium());

       ins= new LifeInsurance(amount);
        System.out.println("Life Insurance Premium: "+(int)ins.calculatePremium());
    }
}