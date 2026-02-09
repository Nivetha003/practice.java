import java.util.Scanner;
class Employee{
    protected double basicsalary;
    Employee(double basicsalary){
        this.basicsalary = basicsalary;
    }
}
class Manager extends Employee{
    private double hra;
	private double da;
Manager(double basicsalary, double  hra, double da){
    super(basicsalary);
    this.hra = hra;
    this.da = da;
}
double calculatetotalsalary(){
    return basicsalary+hra+da;
}
}

public class Basic1
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Basic Salary: ");
	   double basicsalary = sc.nextDouble();
	   System.out.print("HRA: ");
	   double hra = sc.nextDouble();
	   System.out.print("DA: ");
	   double da = sc.nextDouble();
	   Manager manager = new Manager(basicsalary, hra, da);
        System.out.print("Total Salary: " + (int) manager.calculatetotalsalary());


	}
}