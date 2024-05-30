package Dziedziczenie;

public class Shop {
    public static void main(String[] args) {

        Mouse mouse = new Mouse(20, 2000, "Myszka 1", "Producent myszek", 3);
        Keyboard keyboard = new Keyboard(100, 2001, "Klawaitura 1", "Producent Klawaiatury ", 104);
        Monitor monitor = new Monitor(500, 2002, "Monitor 1", "Producent monitorów", 1980);

        Computer computer = new Computer(mouse, keyboard, monitor);


    }
}
