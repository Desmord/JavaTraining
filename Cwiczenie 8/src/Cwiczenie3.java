import java.util.HashSet;
import java.util.Iterator;

class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
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


public class Cwiczenie3 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Ola");
        hashSet.add("Kasia");
        hashSet.add("Daniel");

        Iterator<String> namesIterator = hashSet.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        System.out.println(hashSet);
        System.out.println("----------------------------------------");


        HashSet<Car> hashSetCars = new HashSet<>();
        hashSetCars.add(new Car("Dodge"));
        hashSetCars.add(new Car("Opel"));
        hashSetCars.add(new Car("Fiat"));

        Iterator<Car> cars = hashSetCars.iterator();
        while (cars.hasNext()){
            System.out.println(cars.next().toString());
        }

        System.out.println(hashSetCars);


    }

}
