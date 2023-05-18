package lab08.cwiczenia_z_lekcji;

public class zad2 {
    public static void main(String[] args){
        try{
            System.out.println("5! = " + silnia(5));
            System.out.println("6! = " + silnia(6));
            System.out.println("-21! = " + silnia(-21));
        }catch (silniaException e){
            System.out.println("error " + e.getMessage());
        }
    }

    public static int silnia(int n) throws silniaException{
        if (n < 0)
            throw new silniaException("silnia musi > 0 ");
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

}



class silniaException extends Exception{
    public silniaException(String message){
        super(message);
    }
}