import java.util.Scanner;
class Shape {
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return 3.14159 * radius * radius;
    }
}
public class Inherit6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rectangle Length: ");
        double length = sc.nextDouble();
        System.out.print("Rectangle Width: ");
        double width = sc.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rect.area());
        System.out.print("Circle Radius: ");
        double radius = sc.nextDouble();
        Circle circ = new Circle(radius);
        System.out.println("Circle Area: " + circ.area());
    }
}
