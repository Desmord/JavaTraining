import java.util.ArrayList;

class Animal {
    public Animal() {
    }
}

class Zoo<T extends Animal>{
    private ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal){
        this.animals.add(animal);
    }

    public void printAllAnimals(){
        for(Animal a:animals){
            System.out.println(a);
        }
    }
}


public class Cwicznie2 {
    public static void main(String[] args) {

    }
}
