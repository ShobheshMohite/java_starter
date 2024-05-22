import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        System.out.println("Vector: " + vector);
        System.out.println("First element: " + vector.get(0));
        vector.remove("Banana");
        System.out.println("After removal: " + vector);
    }
}
