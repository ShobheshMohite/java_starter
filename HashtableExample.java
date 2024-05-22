import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

        System.out.println("Hashtable: " + hashtable);
        System.out.println("Value for key 'Banana': " + hashtable.get("Banana"));
        hashtable.remove("Banana");
        System.out.println("After removal: " + hashtable);
    }
}
