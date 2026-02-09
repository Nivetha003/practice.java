import java.util.Scanner;
class Shape {
    double area() {
        return 0;
    }
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
        return Math.PI * radius * radius;
    }
}
public class Poly2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape;
        System.out.print("Rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        shape = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + (int) shape.area());
        System.out.print("Circle Radius: ");
        double radius = sc.nextDouble();
        shape = new Circle(radius);
        System.out.printf("Circle Area: %.2f", shape.area());
    }
}
