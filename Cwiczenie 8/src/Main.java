import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList listaProbaDoWszystkiego = new ArrayList();
        ArrayList<String> listaProbna = new ArrayList<>();
        // Mozna używać typy klas żeby przechowywać obiekty klasy
        // listaProbna.add("wyraz")
        //            .remove(0)
        //            .get(1)
        //            .size() - pobiera wymiar
        //            .set(3,"wyraz 2")  - nadpisujemy obiekt pod indeksem 3
        //            Collections.sort(listaProbna);

        // przechodzenie przez listę
        for (String s : listaProbna) {
            System.out.println(s);
        }
        // mozna za pomoca zwykłej petli
        // można za pomoca Iterator i pozniej w petli while z poleceniem hasNext

        // ArrayList implementuje interfej Collection i mozna używać metod z tego interfejsu
        //      np contains, containsAll, removeAll

//        _________________________________________________________________________________
//        _________________________________________________________________________________
//        _________________________________________________________________________________

        LinkedList linkedList1 = new LinkedList();
        // removeFirstOccurrence();
        // removeLastOccurrence()

//        _________________________________________________________________________________
//        _________________________________________________________________________________
//        _________________________________________________________________________________

        // wartości sa unikalne
        HashSet hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();


    }
}