class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " is barking");
    }
};

public class basic6
{
    public static void main(String arg[])
    {
        Dog dog = new Dog();
        dog.name = "Johnyy";
        dog.age = 9;
        dog.bark();
    }
};
