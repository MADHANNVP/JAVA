class Shape
{
    String calculateArea()
    {
    return "shapeis";
}}
class Circle extends Shape
{
    String calculateArea()
    {
       return "Shape is circle"; 
    }
}
class Rectangle extends Shape
{
    String calculateArea()
    {
       return "Shape is circle"; 
    }
}
class Triangle extends Shape
{
    String calculateArea()
    {
       return "Shape is circle"; 
    }
}
public class inhertance3 {
    public static void main(String[] args) {
      Circle circle=new Circle();  
      Rectangle rectangle=new Rectangle();  
      Triangle triangle=new Triangle();
      System.out.println(circle.calculateArea());
      System.out.println(rectangle.calculateArea());
      System.out.println(triangle.calculateArea());  
    }
    
}
