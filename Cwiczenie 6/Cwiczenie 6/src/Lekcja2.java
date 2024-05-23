
class Employee {
    String name;
    String surName;
    String jobTitle;

    // Można korzystać z dwoch konstruktorów
    public Employee(){
        this.name = "not defined";
        this.surName = "not defined";
        this.jobTitle = "not defined";
    }

    public Employee(String name, String surName, String jobTitle) {
        this.name = name;
        this.surName = surName;
        this.jobTitle = jobTitle;
    }

    public void printData() {
        System.out.println("Imie: " + this.name);
        System.out.println("Nazwisko: " + this.surName);
        System.out.println("Nazwa stanowiska: " + this.jobTitle);
    }
}

public class Lekcja2 {
    public static void main(String[] args) {

        Employee pracownik = new Employee("Mikołaj", "Chojnacki", "Doradca klienta");

        pracownik.printData();
    }
}
