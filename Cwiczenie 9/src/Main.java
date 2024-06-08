
// Typy generyczne umorzliwaja tworzenie kodu który może być
// wykorzystany dla różnych typów
// Przyjeło się że oznacznie typu dużymi literami np. T, U, V...

class Test<T, U, V> {
    private T zmienna1;
    private U zmienna2;
    private V zmienna3;

    public Test(T zmienna1, U zmienna2, V zmienna3) {
        this.zmienna1 = zmienna1;
        this.zmienna2 = zmienna2;
        this.zmienna3 = zmienna3;
    }

    @Override
    public String toString() {
        return "Test{" +
                "zmienna1=" + zmienna1 +
                ", zmienna2=" + zmienna2 +
                ", zmienna3=" + zmienna3 +
                '}';
    }
}

// Można bardziej precyzować jakie typy możemy tutaj dac
class TestRozszezajacy<T extends Test,U extends String,V> {

}

public class Main {
    public static void main(String[] args) {

        Test<Integer, String, String> testObject = new Test(2, "Napis", "Napis");
        System.out.println(testObject.toString());
    }
}