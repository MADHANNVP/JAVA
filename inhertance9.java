abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starts with a key or push button.");
    }
    void stopEngine() {
        System.out.println("Car engine stops when the key is turned off or button is pressed.");
    }
}
class Motorcycle extends Vehicle {
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kick or electric start.");
    }
    void stopEngine() {
        System.out.println("Motorcycle engine stops when the key is turned off or kill switch is used.");
    }
}
public class inhertance9 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        Vehicle motorcycle = new Motorcycle();
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
