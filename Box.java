//generic class 
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(123);          // Box for integers
        Box<Double> doubleBox = new Box<>(456.78);     // Box for doubles

        System.out.println("Integer Box: " + intBox.getValue());
        System.out.println("Double Box: " + doubleBox.getValue());
    }
}
