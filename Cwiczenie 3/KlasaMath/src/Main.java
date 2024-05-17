import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        double d =16.0;
        double sqrt = Math.sqrt(d);

        System.out.println(sqrt);

//        --------------------------------------------------------
//        --------------------------------------------------------
        BigInteger num = new BigInteger("985421509172465891726");
        num = num.add(new BigInteger("124358"));

        System.out.println(num);

//        --------------------------------------------------------
//        --------------------------------------------------------
        BigDecimal numDouble = new BigDecimal("218756312.1234123");

        System.out.println(numDouble);
    }
}