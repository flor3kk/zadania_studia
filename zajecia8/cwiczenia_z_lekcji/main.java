package lab08.cwiczenia_z_lekcji;

public class main {

    public static void main(String[] args){

        //System.out.println(getNumber(10));

        try{
            int wynik = 5/0;

        }catch( ArithmeticException e){
            System.out.println("ArithmeticException -> " + e.getMessage());
        }
        finally {
            System.out.println("blok finally");
        }

    }

    public static int getNumber(int hour){
        if(hour < 0)
            throw new IllegalArgumentException("nie moze byc ujemna liczba");
        return hour*60*60;
    }


}
