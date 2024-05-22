import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        System.out.println("Contains Banana: " + set.contains("Banana"));

        // Removing an element
        set.remove("Banana");

        // Checking the size of the set
        System.out.println("Size of set: " + set.size());
    }
}
