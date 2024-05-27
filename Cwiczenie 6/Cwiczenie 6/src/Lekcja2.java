
class Employee {
    String name;
    String surName;
    String jobTitle;
    int earnings;

    // Można korzystać z dwoch konstruktorów
    public Employee() {
        this.name = "not defined";
        this.surName = "not defined";
        this.jobTitle = "not defined";
        this.earnings = 1000;
        // Mozna nazwaZmienne = zmienna   bez this jesli nie ma konfliktu nazw
    }

    public Employee(String name, String surName, String jobTitle, int earnings) {
        this.name = name;
        this.surName = surName;
        this.jobTitle = jobTitle;
        this.earnings = earnings;
    }

    public void printData() {
        System.out.println("Imie: " + this.name);
        System.out.println("Nazwisko: " + this.surName);
        System.out.println("Nazwa stanowiska: " + this.jobTitle);
        System.out.println("Obecne zarobki: " + earnings);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void addEarnings(int pay) {
        this.earnings += pay;
    }

    public void printEarnings() {
        System.out.println("Obecne zarobki: " + earnings);
    }

    public int earningsPlusP() {
        return this.earnings + 600;
    }

    // Przeciążanie
    public int metoda1(int x) {
        return x;
    }

    public float metoda1(float x) {
        return x;
    }

    public int metoda1(int x, int y, int z) {
        return x + y + z;
    }
}

public class Lekcja2 {
    public static void main(String[] args) {

        Employee pracownik = new Employee("Mikołaj", "Chojnacki", "Doradca klienta", 1000);

        pracownik.printData();
        pracownik.setName("Nowy Mikołaj");
        pracownik.addEarnings(100);
        pracownik.printEarnings();
        System.out.println(pracownik.earningsPlusP());
    }
}
