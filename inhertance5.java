import java.util.*;
abstract class Shape{
    abstract double getArea();
    abstract double getPerimeter();
}
class Circle extends Shape{
    double getArea()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Radius ");
      double radius=s.nextInt(); 
      return Math.PI*radius*radius;
    }
    double getPerimeter()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Radius ");
        double radius=s.nextInt(); 
        return 2*Math.PI*radius;
    }
}
class Rectangle extends Shape{
    double getArea()
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the Length ");
     Double length=s.nextDouble();
     System.out.println("Enter the Width ");
     Double width=s.nextDouble();
     return length*width;
    }
    double getPerimeter()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Length ");
        Double length=s.nextDouble();
        System.out.println("Enter the Width ");
        Double width=s.nextDouble();
        return 2 * (length + width);
    }
}
class Triangle extends Shape{
    double getArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the Base ");
        Double base=s.nextDouble();
        System.out.println("Enter the Heigth ");
        Double height=s.nextDouble();
        return 0.5*base*height;
  
    }
    double getPerimeter()
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the Side 1 ");
        Double side_1=s.nextDouble();
        System.out.println("Enter the Side 2 ");
        Double side_2=s.nextDouble();
        System.out.println("Enter the Side 3 ");
        Double side_3=s.nextDouble();
        return side_1+side_2+side_3;
    }
}
public class inhertance5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
