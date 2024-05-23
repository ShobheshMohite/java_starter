// 18. What is abstraction in Java?
// Example:
// Abstraction is the concept of hiding the implementation details and showing 
// only the necessary features of an object.

abstract class Animal {
    abstract void sound(); // Abstract method

    void sleep() {
        System.out.println("This animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class basic8
{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.sleep();
    }
}
