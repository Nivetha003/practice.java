import java.util.Scanner;
class Employee{
    double salary;
    Employee(double salary){
        this.salary = salary;
    }
    double calculatebonus(){
        return 0;
    }
}
class Developer extends Employee{
    Developer(double salary){
        super(salary);
        
        
    }
    double calculatebonus(){
        return salary*0.20;
    }
}
class Tester extends Employee{
    Tester(double salary){
        super (salary);
    }
    double calculatebonus(){
        return salary*0.15;
    }
}
public class Polymor3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        Employee emp1 = new Developer(salary);
        Employee emp2 = new Tester(salary);
        System.out.println("Developer Bonus: "+(int)emp1.calculatebonus());
        System.out.println("Tester Bonus: "+(int)emp2.calculatebonus());
    }
}