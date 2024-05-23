// 6. What are the pillars of object-oriented programming?
// Example:

// Encapsulation: Wrapping data and code together.
// Inheritance: Mechanism to create a new class using properties and methods of an existing class.
// Polymorphism: Ability to take many forms. A method can perform different tasks based on the object that it is acting upon.
// Abstraction: Hiding complex implementation details and showing only essential features.

class Vehicle{
    private String brand;
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
}

class Car extends Vehicle{
    private String model;
    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
}

public class basic5{
    public static void main(String arg[])
    {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Fortuner");
        System.out.println("Brand: " + car.getBrand() + ", Model : " + car.getModel());

    }
}