import java.util.*;
abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Circle extends Shape 
{
    void draw() {
        System.out.println("Drawing a Circle.");
    }
    double calculateArea() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Radius ");
        double radius=s.nextInt(); 
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle 
{
    void draw() {
        System.out.println("Drawing a Cylinder.");
    }
    double calculateArea() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Height ");
        double height=s.nextInt(); 
        System.out.println("Enter the Radius ");
        double radius=s.nextInt(); 
        return 2 * Math.PI * radius * (radius + height);
    }
}

public class inhertance10 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("Circle Area: " + circle.calculateArea());
        Shape cylinder = new Cylinder();
        cylinder.draw();
        System.out.println("Cylinder Total Surface Area: " + cylinder.calculateArea());
    }
}
