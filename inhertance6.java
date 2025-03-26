abstract class Animal
{
    abstract void move();
    abstract void makeSound();
}
class Bird extends Animal
{
    void move()
    {
        System.out.println("Bird flies in the sky.");
    }
    void makeSound()
    {
        System.out.println("Bird chirps melodiously.");
    }
}
class Panthera extends Animal
{
    void move()
    {
        System.out.println("Panthera walks stealthily.");
    }
    void makeSound()
    {
        System.out.println("Panthera roars loudly.");
    }}
public class inhertance6 {
    public static void main(String[] args) {
        System.out.println("Bird:");
        Bird bird = new Bird();
        bird.move();
        bird.makeSound();
        System.out.println("\nPanthera:");
        Panthera panthera=new Panthera();
        panthera.move();
        panthera.makeSound();
    }
}
