// Parent Class (Base Class)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1 (Inherits Animal)
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2 (Inherits Animal)
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main Class
public class OOPExample {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();   // Runtime Polymorphism
        a.sound();

        a = new Cat();   // Method Overriding
        a.sound();
    }
}
