import java.util.Scanner;
class Person{
    String name;
}
class Employee extends Person{
    int basicsalary;
}
class Developer extends Employee{
    int bonus;
    
    int calculatetotalsalary(){
        return basicsalary+bonus;
    }
}
public class Inherit5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Developer d = new Developer();
        d.basicsalary = sc.nextInt();
        d.bonus = sc.nextInt();
        System.out.println("Total Salary: " +d.calculatetotalsalary());
         
        
        
    }
}