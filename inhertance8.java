abstract class Animal {
    abstract void eat();
    abstract void sound();
}
class Lion extends Animal {
    void eat() {
        System.out.println("Lion eats meat.");
    }
    void sound() {
        System.out.println("Lion roars loudly.");
    }
}
class Tiger extends Animal {
    void eat() {
        System.out.println("Tiger hunts and eats its prey.");
    }

    void sound() {
        System.out.println("Tiger growls fiercely.");
    }
}

class Panther extends Animal {
    void eat() {
        System.out.println("Panther feeds on other animals.");
    }
    void sound() {
        System.out.println("Panther makes a deep snarling sound.");
    }
}
public class inhertance8 {
    public static void main(String[] args) {
        Animal lion = new Lion();
        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        Animal tiger = new Tiger();
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        Animal panther = new Panther();
        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
}
