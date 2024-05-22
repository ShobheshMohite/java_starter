import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        for(String fruits : list){
            System.out.println(fruits);
        }

        System.out.println("First Element Is : "+list.get(0));

        //list.remove(1);
        list.remove("Banana");

        System.out.println("After Removing: ");
        for(String fruits : list){
            
            System.out.println(fruits);
        }

        System.out.println("Size of list : "+list.size());
    }
}
