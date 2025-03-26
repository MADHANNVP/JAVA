import java.util.Scanner;
class Shape
{
    double calculateArea()
    {
    return 0;
}}
class Circle extends Shape
{
    double calculateArea()
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Radius ");
       double radius=s.nextDouble();
       double circle=Math.PI*radius*radius;
       return circle;
    }
}
class Rectangle extends Shape
{
    double calculateArea()
    {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter  the Width ");
       double width=s.nextDouble();
       System.out.println("Enter  the length ");
       double length=s.nextDouble(); 
       double rectangle=width*length;
       return rectangle;
    }
}
class Triangle extends Shape
{
    double calculateArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter  the Base ");
       double base=s.nextDouble();
       System.out.println("Enter  the Height ");
       double heigth=s.nextDouble(); 
       double triangle=0.5*base*heigth;
       return triangle;
    }
}
public class inhertance3 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();  
        Triangle triangle=new Triangle();
        Circle circle=new Circle();  
      System.out.println("Area of Circle: " +circle.calculateArea());
      System.out.println("Area of Rectangle: " +rectangle.calculateArea());
      System.out.println("Area of Triangle: " +triangle.calculateArea());  
    }
    
}
