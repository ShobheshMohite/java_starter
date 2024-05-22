//generic method
public class templateJava {

    public static<T extends Comparable<T>> T FindMax(T a,T b)
    {
        return (a.compareTo(b)>0) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println("Max Of 3 & 7 is : "+FindMax(3,7));
        System.out.println("Max Of 3.55 & -3.2 is : "+FindMax(3.55,-3.2));

    }
}
