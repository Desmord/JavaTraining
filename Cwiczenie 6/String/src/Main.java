public class Main {
    public static void main(String[] args) {

        String name = "Mikołaj";
        String suName = new String("Chojnacki");
        String names[] = {"Mikołaj", "Ala", "Leszek", "Dorota"};

        String allNames = "" + names[0] + " " + names[1] + " " + names[2] + " " + names[3];
        System.out.println(allNames);

        // funkcjie String sa niemutowalne czyli zawsze tworzy nowy łańcuch bez
        // zmieniania starego

//        if(s1.euqls(s2)) tak sie porownuje Stringi
//        if(s1.eualsIgnoreCase(s2))

        // Jesli chcemy  zoptymalizować predkość działania programu to
        // uzywamy StringBuildier

    }
}