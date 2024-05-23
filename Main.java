// <!-- 13. What is polymorphism in Java?
// Example:
// Polymorphism allows methods to do different things based on the object 
// it is acting upon. It can be achieved through method overriding and 
// method overloading -->

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal myAnimal = new Dog(); // Polymorphism//
        Animal myAnimal = new Dog();
        Animal myAnimal1 = new Animal();
        myAnimal1.sound();// Animals's sound() method is called
        myAnimal.sound(); // Dog's sound() method is called
    }
}
