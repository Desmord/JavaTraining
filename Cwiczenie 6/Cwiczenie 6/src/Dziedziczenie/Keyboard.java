package Dziedziczenie;

public class Keyboard extends Product{
    int numKeys = 104;

    Keyboard(int price, int productionYear, String name, String manufacturer,int numKeys) {
        super(price, productionYear, name, manufacturer);
        this.numKeys = numKeys;
    };
}
