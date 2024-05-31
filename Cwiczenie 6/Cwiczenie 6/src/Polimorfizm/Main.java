package Polimorfizm;

public class Main {
    public static void main(String[] args) {

        Flat[] homes = new Flat[10];

        for (int i = 0; i < homes.length; i++) {
            int randNum = (int) Math.floor(Math.random() * 3);

            if (randNum == 0) {
                homes[i] = new Flat("Miasto" + i, "Ulica" + i);
            }

            if (randNum == 1) {
                homes[i] = new House("Miasto" + i, "Ulica" + i, 100 + i);
            }

            if (randNum == 2) {
                homes[i] = new Residence("Miasto" + i, "Ulica" + i, 100 + i, 50 + i);
            }
        }

        for (int i = 0; i < homes.length; i++) {
            System.out.println("home i: "+i);
            Flat home = homes[i];

            if(home instanceof Residence){
                Residence residence = (Residence) home;
                System.out.println(residence.toString());
            }

        }

    }
}
