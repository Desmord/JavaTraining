import java.util.ArrayList;
import java.util.Iterator;

public class Cwiczenie1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ola");
        names.add("Kasia");
        names.add("Daniel");

        System.out.println(names.get(0));

        names.set(2,"Olek");
        names.add(1,"Karol");
        names.remove(0);

        for(String e:names){
            System.out.println(e);
        }
        
        System.out.println("-------------------------------------");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }



    }
}
