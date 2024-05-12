public class Main {
    public static void main(String[] args) {

        final float daysInYear = 365;
        float deposit = 1000;
        float numDays = 180;
        float intrestRate = 0.06f;
        float taxRate = 0.19f;

        float intrest = (deposit * numDays * intrestRate) / daysInYear;
        float tax = intrest * taxRate;
        float profit = intrest - tax;

        System.out.println("Zysk: " + intrest);
        System.out.println("Podatek: " + tax);
        System.out.println("Zysk po odliczeniu podatku: "+profit);
    }
}