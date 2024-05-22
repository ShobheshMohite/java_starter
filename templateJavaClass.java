//generic class 
public class templateJavaClass<T> {
    private T value;

    public templateJavaClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        templateJavaClass<Integer> intBox = new templateJavaClass<>(123);          // Box for integers
        templateJavaClass<Double> doubleBox = new templateJavaClass<>(456.78);     // Box for doubles

        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("Double Box: " + doubleBox.getValue());
    }
}
