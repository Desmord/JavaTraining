package Bledy;

public class Main {
    public static void main(String[] args) {


        try{
            System.out.println("cos");
            throw  new Blad();
        }catch (Blad e){
            System.out.println("Wywołanie własnego błedu");
        }

    }
}
