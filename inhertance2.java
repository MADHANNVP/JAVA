class Vehicle
{
    void speedUp()
    {
        System.out.println("The vehicle is speeding up.");
    }
}
class Car extends Vehicle
{
    void speedUp()
    {
        System.out.println("The car accelerates quickly to 60 mph.");
    }
}
class Bicycle extends Vehicle
{
    void speedUp()
    {
        System.out.println("The bicycle accelerates slowly to 15 mph.");
    }
}
public class inhertance2{
 public static void main(String[] args)
 {
   Car car=new Car();
   Bicycle bicycle=new Bicycle();
   car.speedUp();
   bicycle.speedUp();
 }
}
