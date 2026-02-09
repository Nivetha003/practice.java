import java.util.Scanner;
class Vehicle{
    protected int distance;
    Vehicle(int distance){
        this.distance = distance;
    }
}
class Car extends Vehicle{
    int fuel;
    Car(int distance, int fuel){
        super(distance);
        this.fuel=fuel;
    }
    int totalmileage(){
        return distance/fuel;
    }
}
public class Inherit3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Distance: ");
        int distance = sc.nextInt();
        System.out.print("Fuel: ");
        int fuel = sc.nextInt();
        
        Car c = new Car(distance, fuel);
        System.out.print("Mileage: " + c.totalmileage() + " km/l");
    }
}