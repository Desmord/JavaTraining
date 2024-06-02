import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());

        // Formatowanie daty
        SimpleDateFormat dateFormat = new SimpleDateFormat("E HH:mm:ss dd.MM.YYYY");
        System.out.println(dateFormat.format(date));
        System.out.println(date.getTime()); // zwroci ilość milisekund

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // modyfikowanie kalendarza
        calendar.add(calendar.HOUR,2);
        calendar.add(calendar.DAY_OF_MONTH,2);
        calendar.add(calendar.MONTH,2); // -2 jesli chcemy odjac
        Date nowaZmieniaData = calendar.getTime();


        // Porownywanie dat dla obiektu LocalDate
//        if(date.isAfter(nowaZmieniaData)){}
//        if(date.isBefore(nowaZmieniaData)){}
//        if(date.isEqual(nowaZmieniaData)){}
    }
}