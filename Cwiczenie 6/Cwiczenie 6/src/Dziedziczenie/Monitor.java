package Dziedziczenie;

public class Monitor extends Product {
    int resolutions = 1080;

    Monitor(int price, int productionYear, String name, String manufacturer, int resolutions) {
        super(price, productionYear, name, manufacturer);
        this.resolutions = resolutions;
    }
}
