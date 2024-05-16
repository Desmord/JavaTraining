import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChallenge {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj swoje imie");
        String name = reader.readLine();

        System.out.println("Podaj swoje miasto");
        String city = reader.readLine();

        System.out.println("Twoje imie to: " + name+". Mieszkasz w "+city);
        System.out.println("Liczba liter w miescie to :"+city.length());




    }

}
