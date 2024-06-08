// Wyrażenia lambda są blokami kodu który moża przypisać do zmiennej i przekazywac miedzy różnymi
// cześciami programu w celu późniejszego ich wykorzystania.
// Interfejsy funkcyjne

// Operator :: może zapisywac w zmiennej referencje do metody jakiego interfejsu

interface Addition {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {

        Addition addition = (int a, int b) -> a + b;  // moża nawiasy klamrowe by miec klika linijek kodu
        int result = addition.add(10,5);
        System.out.println(result);

    }
}