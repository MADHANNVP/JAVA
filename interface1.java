interface Flyable{
    public void fly_obj();
}
class Spacecraft implements Flyable
{
 public void fly_obj()
{
    System.out.println("The spacecraft is flying in space!");
}
}
class Airplane implements Flyable
{
   public  void fly_obj()
{
    System.out.println("The airplane is flying in the sky!");
}
}
class Helicopter implements Flyable
{
    public void fly_obj()
    {
        System.out.println("The helicopter is flying with its rotor blades!"); 
    }
}
class interface1{
    public static void main(String[] args)
    {
        Spacecraft spac=new Spacecraft();
        Airplane airp=new Airplane();
        Helicopter helic=new Helicopter();
        spac.fly_obj();
        airp.fly_obj();
        helic.fly_obj();
    }
}