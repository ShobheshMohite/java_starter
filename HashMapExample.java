import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        System.out.println("HashMap: " + map);
        System.out.println("Value for key 'Banana': " + map.get("Banana"));
        map.remove("Banana");
        System.out.println("After removal: " + map);
    }
}
