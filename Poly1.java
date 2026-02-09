import java.util.Scanner;
class Employee {
    double calculateSalary() {
        return 0;
    }
}
class Manager extends Employee {
    double salary;
    Manager(double salary) {
        this.salary = salary;
    }
    double calculateSalary() {
        return salary;
    }
}
class Developer extends Employee {
    double salary;
    Developer(double salary) {
        this.salary = salary;
    }
    double calculateSalary() {
        return salary;
    }
}
public class Poly1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp;
        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();
        emp = new Manager(managerSalary);
        System.out.println("Manager Salary: " + emp.calculateSalary());
        System.out.print("Enter Developer Salary: ");
        double developerSalary = sc.nextDouble();
        emp = new Developer(developerSalary);
        System.out.println("Developer Salary: " + emp.calculateSalary());
    }
}
