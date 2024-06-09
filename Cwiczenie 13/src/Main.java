import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


// lepsze sa    FileReader
//              FileWriter
// BufferedInputStream
// BufferedOutpuStream

// Zapis objektow robimy dzieki Serializaji
// Obiekt musi implementowac  Serializable
//      ObjectOutputStream
//      ObjectInputStream


// Klasa File daje dostep do danych o plikach

public class Main {
    public static void main(String[] args) throws IOException {

        char chars[] = {'Q','m'};

        FileOutputStream out = null;

        try{
            // tylko nazwa to utworzy w katalogu programu
            out = new FileOutputStream("Nazwa pliku.txt");

            for(char c: chars){
                out.write(c);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            out.close();
        }


    }
}