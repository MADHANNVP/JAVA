class Animal
{
    void Sound()
    {
        System.out.println("The animal makes a sound.");
    }
}
class Bird extends Animal{
     void Sound()
     {
        System.out.println("The bird chirps.");
     }
}
class Cat extends Animal
{
    void Sound()
    {
        System.out.println("The cat meows.");
    }
}
public class inhertance1 {
    public static void main(String[] args)
    {
       Bird bird=new Bird();
       Cat cat=new Cat();
       bird.Sound();
       cat.Sound();
    }
    
}
