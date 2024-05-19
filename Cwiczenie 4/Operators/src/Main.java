public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b, c;

        c = b = a + 5;

        int d = 5;
        d++;
        System.out.println(d); // pokaze 6

//        ---------------------------------------------------------
//        ---------------------------------------------------------

        boolean b1 = 5 == 3; // bedzie false
        boolean b2 = 5 == 5;// bedzie true

        double avg = (1 + 2 + 3 + 4) / 4.0;

        System.out.println("Wynik: " + avg);
        System.out.println("Wynik po inkrementacji: " + ++avg);
        System.out.println("Wynik po dekrementacji: " + --avg);

//        -------------------------------------------------------
//        -------------------------------------------------------

        int e = 5;
        e += a; // do e bedzie dodana wartosc a 

    }
}