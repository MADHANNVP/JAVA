import java.util.*;
abstract class Shape{
    abstract void draw();
    abstract double calculateArea();
}
class Circle extends Shape{
    void draw()
    {
        System.out.println("Drawing a Circle.");
    }
    double calculateArea()
    {
        Scanner s=new Scanner(System.in);
      System.out.println("Enter the Radius ");
      double radius=s.nextInt(); 
      return Math.PI*radius*radius;
    }
}
class Square extends Shape{
    void draw()
    {
        System.out.println("Drawing a Square.");
    }
    double calculateArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side ");
        Double side=s.nextDouble();
        return side*side;
    }
}
class Triangle extends Shape{
    void draw()
    {
        System.out.println("Drawing a Triangle.");
  
    }
    double calculateArea()
    {
        Scanner s=new Scanner(System.in);
        System.out.println(" Enter the Base ");
        Double base=s.nextDouble();
        System.out.println("Enter the Heigth ");
        Double height=s.nextDouble();
        return 0.5*base*height;
    }
}
public class inhertance7 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        circle.draw();
        System.out.println(circle.calculateArea());
        square.draw();
        System.out.println(square.calculateArea());
        triangle.draw();
        System.out.println(triangle.calculateArea());
    }
}

