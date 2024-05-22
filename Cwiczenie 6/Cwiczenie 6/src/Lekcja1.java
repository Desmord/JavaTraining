
class Car {
    String manufacturer;
    String name;
    int year;
    String color;
    double topSpeed;

    public void ShowData() {
        System.out.println(manufacturer + " " + name);
        System.out.println(year);
        System.out.println(color);
        System.out.println(topSpeed);
    }
}


public class Lekcja1 {

    public static void main(String[] args) {

        Car ford = new Car();
        ford.manufacturer = "Ford";
        ford.name = "Mustang";
        ford.color = "red";
        ford.year = 1900;
        ford.topSpeed = 200;

        ford.ShowData();

    }

}
