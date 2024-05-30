package Dziedziczenie;

public class Mouse extends Product {
    int numButtons = 3;

    Mouse(int price, int productionYear, String name, String manufacturer,int numButtons) {
        super(price, productionYear, name, manufacturer);
        this.numButtons = numButtons;
    }
}
