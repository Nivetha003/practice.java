import java.util.Scanner;
class ElectricityBill {
    private int units;
    public void setUnits(int u) {
        units = u;
    }
    public void calculateBill() {
        int bill;
        if (units <= 100) {
            bill = units * 1;
        } else if (units <= 200) {
            bill = (100 * 1) + ((units - 100) * 2);
        } else {
            bill = (100 * 1) + (100 * 2) + ((units - 200) * 3);
        }
        System.out.println("Total Bill: " + bill);
    }
}
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitsConsumed = sc.nextInt();
        ElectricityBill eb = new ElectricityBill();
        eb.setUnits(unitsConsumed);
        eb.calculateBill();
    }
}
