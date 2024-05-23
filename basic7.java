// 12. What is the purpose of the super keyword in Java?
// Example:The super keyword refers to the superclass and can be used to access superclass
// methods and constructors.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void eat() {
    super.eat(); // Call superclass method
    System.out.println("Dog is eating");
    }
}

public class basic7 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
    }
}
