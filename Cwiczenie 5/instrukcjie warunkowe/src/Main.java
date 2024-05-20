public class Main {
    public static void main(String[] args) {

        int number = 0;

        if (number > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Licza jest równa 0");
        }

        // Ternary operator
        int a = 10;
        int b = a > 5 ? 3 : 99;

    }
}