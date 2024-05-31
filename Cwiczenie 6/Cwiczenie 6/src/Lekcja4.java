
class Bike {

    // Alt + insert służy do generowania seterów i getterów

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String brand;   // Wszystkie
    protected String name; // Ta klasa i dziedziczące
    private String id;     // Tylko ta klasa

    Bike(String brand,String name,String id) {
        this.brand = brand;
        this.name = name;
        this.id = id;
    }
}

class MotorBike extends Bike {
    MotorBike(String brand,String name,String id) {
        super(brand,name,id);
    }
}

public class Lekcja4 {
    public static void main(String[] args) {

    }
}
