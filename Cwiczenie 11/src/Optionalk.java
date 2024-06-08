import java.util.Optional;

public class Optionalk {
    public static void main(String[] args) {

        Optional<String> text = Optional.ofNullable("ads");

        if(text.isPresent()){
            System.out.println("Zmienna instenije");
        }else{
            System.out.println("Zmienna nie instenieje");
        }

    }
}
