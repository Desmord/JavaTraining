
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
    }

    public Employee(String name, String surName, String jobTitle,int earnings) {
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
}

public class Lekcja2 {
    public static void main(String[] args) {

        Employee pracownik = new Employee("Mikołaj", "Chojnacki", "Doradca klienta",1000);

        pracownik.printData();
        pracownik.setName("Nowy Mikołaj");
        pracownik.addEarnings(100);
        pracownik.printEarnings();
    }
}
