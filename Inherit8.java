import java.util.Scanner;
class Company {
    String companyName;
    Company(String companyName) {
        this.companyName = companyName;
    }
}
class HR extends Company {
    int employeeCount;
    HR(String companyName, int employeeCount) {
        super(companyName);
        this.employeeCount = employeeCount;
    }
}
class Payroll extends HR {
    double salaryPerEmployee;
    Payroll(String companyName, int employeeCount, double salaryPerEmployee) {
        super(companyName, employeeCount);
        this.salaryPerEmployee = salaryPerEmployee;
    }
    double calculateTotalPayroll() {
        return employeeCount * salaryPerEmployee;
    }
}
public class Inherit8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Company Name: ");
        String companyName = sc.nextLine();
        System.out.print("Employees: ");
        int employeeCount = sc.nextInt();
        System.out.print("Salary per Employee: ");
        double salaryPerEmployee = sc.nextDouble();
        Payroll payroll = new Payroll(companyName, employeeCount, salaryPerEmployee);
        double totalPayroll = payroll.calculateTotalPayroll();
        System.out.println("Total Payroll: " + totalPayroll);
    }
}
