class Dog {
    String breed;
    int age;
    String color;

    void bark() {
        System.out.println("Woof!");
    }

    void sleep() {
        System.out.println("Zzz...");
    }
    void eat() {
        System.out.println("Nom nom nom");
    }
}
class Dog1 extends Dog {}

class Dog2 extends Dog {}

class Dog3 extends Dog {}

class Dog4 extends Dog {}

class inhertanceandinterface1 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1();
        dog1.breed = "Labrador";
        dog1.age = 3;
        dog1.color = "Yellow";
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
        dog1.bark(); 
        dog1.sleep();
        dog1.eat(); 
    }
}