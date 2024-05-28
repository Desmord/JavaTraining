class Example {
    private static Example instance;

    private Example() {
    }

    public static Example getInstance() {

        if (instance == null) {
            instance = new Example();
        }
        return instance;

    }

}


public class Singleton {

    public static void main(String[] args) {

        Example instance1 = Example.getInstance(); // Utworzy
        Example instance2 = Example.getInstance(); // Nie utworzy

    }
}
