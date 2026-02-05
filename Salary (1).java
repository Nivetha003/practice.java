import java.util.Scanner;
class Employee {
    private int salary;
    public void setSalary(int sal) {
        salary = sal;
    }
    public void calculateInterest() {
        int tax = salary / 10;
        int totalAmount = salary - tax;
        System.out.println("Interest: " + tax);
        System.out.println("Total Amount: " + totalAmount);
    }
}
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        int sal = sc.nextInt();
        Employee emp = new Employee();
        emp.setSalary(sal);
        emp.calculateInterest();

    }
}
