
class Square<T extends Number> {
    private T wall;

    public double getSurfaceArea() {
        double wall = this.wall.doubleValue();
        return wall;
    }

    public Square(T wall) {
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }
}

public class Cwicznie1 {
    public static void main(String[] args) {

        Square<Integer> integerSquare = new Square<>(10);
        System.out.println(integerSquare.getSurfaceArea());

    }
}
