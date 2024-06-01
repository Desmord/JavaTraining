public class Lekcja5 {

    public static void main(String[] args) {

        try{
            System.out.println("Cos robimy");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wyjscie poza tablice");
        }catch(Exception e){
            System.out.println("Exception jest klasą nadrzedną więc wyłapuje wszystkie błedy.");
        } finally {
            System.out.println("Zawsze się wykona nie zależnie od tego czy był czy nie bład");
        }


        try{
            System.out.println("Cos Robimy");
            throw new Exception();
        }catch (Exception e){
            System.out.println("Przechwytuemy włase błedy");
        }

    }

//    Mozna zrobic własa klase z własnym błedem rozszerzająca Exception by pózniej ja wyłapywać w try


}
