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

        // Switch
        int num = 9;

        switch (num) {
            case 3:
            case 4:
                System.out.println("nie");
                break;
            case 7:
                System.out.println("tak");
                break;
            default:
                System.out.println("niewiem");
        }

        // For
        String namesFor[] = {"Mikołaj", "Mikołaj1"};
        for (int i = 0; i < namesFor.length; i++) {
            // for (String s : namesFor) {  to samo to wyzej, petla for each
            System.out.println(namesFor[i]);
            // break;  ---> przerywa całą petle
            // continue;  ---> przerywa aktualnie wykonywaną iteracje
        }

        // While
        while (num >= 0) {
            System.out.println(num);
            num--;
        }

        // For each
        for (String s : namesFor) {
            System.out.println(s);
        }

    }
}