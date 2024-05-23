// 40. What is the purpose of the final keyword for variables in Java?
// Example:
// The final keyword is used to declare constants. 
// A final variable's value cannot be changed once it is initialized.

public class final{
    public static void main(String[] args) {
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; // This will cause a compile-time error
        System.out.println("MAX_VALUE: " + MAX_VALUE);
    }
}
