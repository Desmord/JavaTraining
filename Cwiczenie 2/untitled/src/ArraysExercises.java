import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysExercises {

    public static void main(String[] args) throws IOException {

        String[] names = {"Mikołaj","Ala","Paweł","Łukasz","Ola","Basia"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj Index tablicy od 0 do " + (names.length - 1));
        String arrIndex = reader.readLine();

        int arrIndexInt = Integer.parseInt(arrIndex);

        System.out.println("Wybrane imie to: "+names[arrIndexInt]);

    }
}
