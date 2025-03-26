class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class inhertanceandinterface3_1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.bark();
    }
}
