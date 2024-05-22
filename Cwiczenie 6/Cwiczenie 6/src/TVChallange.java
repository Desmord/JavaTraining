
class Tv {
    String producent;
    String model;
    int year;
    boolean darkAndWhite;

    public void printBasicData() {
        System.out.println(producent + " " + model + " " + year + " " + darkAndWhite);
    }
}

public class TVChallange {
    public static void main(String[] args) {

        Tv myTv = new Tv();

        myTv.producent = "Proc";
        myTv.model = "Model 1";
        myTv.year = 2000;
        myTv.darkAndWhite = false;

        myTv.printBasicData();

    }
}
