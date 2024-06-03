import java.util.LinkedList;
import java.util.ListIterator;

class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class Cwicznie2 {
    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();

        String elements[] = {"dog", "cat", "Tiger", "Lion", "Panda"};

        for (int i = 0; i < 20; i++) {
            String randEl = elements[(int) Math.floor(Math.random() * elements.length)];
            animals.add(new Animal(randEl));
        }

        animals.removeFirst();
        animals.removeLast();
        animals.addFirst(new Animal("Tosia"));
        animals.addLast(new Animal("cosiek"));

        ListIterator<Animal>  iterator = animals.listIterator();

        while (iterator.hasNext()){
            Animal animal = iterator.next();
            System.out.println(animal.toString());
        }



    }
}
