// Strumnienie
// Strumienie pozwalaja na łatwą iteracje oraz manipulowanie elementami pn kolekcji.

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Car {
    public String name;
    public int topSpeed;
    public int price;
    public int seatsNumber;

    public Car(String name, int topSpeed, int price, int seatsNumber) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.seatsNumber = seatsNumber;
    }
}


public class Main {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("Mikolaj");
        array.add("Dorota");
        array.add("Ola");

        // mozna stosowac metody jak   Reduce, Filter, Count, Collect


        array.stream().forEach(el -> System.out.println(el));
        long num = array.stream().filter(el -> el.length() > 4).count(); // Filtruje imiona na podastawie długośc

        // .filter(e-> cos).filter(e-> cos).filter ...

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Dodge", 240, 2000, 4));
        cars.add(new Car("Ford", 180, 2500, 6));
        cars.add(new Car("BMW", 220, 1800, 4));
        cars.add(new Car("Porshe", 270, 1500, 2));

        // Collect
        System.out.println("Collect ----------------------------------------------------------------");
        List<Car> collectList = cars.stream()
                .filter(e -> e.topSpeed < 270)
                .filter(e -> e.seatsNumber > 2)
                .filter(e -> e.price < 2800)
                .collect(Collectors.toList());

        ArrayList<Car> collectArray = new ArrayList<>(collectList);
        collectArray.forEach(c-> System.out.println(c.name));

        //ToSet zeby stworzyc tylko unikalne elementy
        System.out.println("ToSet ----------------------------------------------------------------");

        // Klasa powinno implementowac Comparator i pozniej nadpisac metode equals zeby set był z
        // unikalnymi wartosciami a nie domyslny equals
        Set<Car> setCars = cars.stream().collect(Collectors.toSet());

        // summingInt
        // toMap
        // min, max
        // limit  ogranicza liczbe wynikow
        // count
        // reduce
        // iterate

    }
}