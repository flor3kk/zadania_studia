package lab08.cwiczenia_z_domu;

import java.util.Scanner;

public class cw4 {
    public static void main(String[] args) {

        /*try {
            dzielenie(23, 5);
        } catch (dzielenieZeroException e) {
            System.out.println("dzielenie przez zero: " + e.getMessage());
        }*/

        try {
            Dzielenie dz = new Dzielenie(23, 5);
        }catch (dzielenieZeroException e) {
            System.out.println("zakazane, " + e.getMessage());
        }

        try {
            Dzielenie dz2 = new Dzielenie(23, 0);
        }catch (dzielenieZeroException e) {
            System.out.println("zakazane, " + e.getMessage());
        }

        try {
            Dzielenie dz2 = new Dzielenie(0, 0);
        }catch (dzielenieZeroException e) {
            System.out.println("zakazane, " + e.getMessage());
        }
    }

}

class Dzielenie{
    private float a, b;

    public Dzielenie(float a, float b) throws dzielenieZeroException{
        String error = "";

        if(b == 0) error += "nie mozna dzielic przez 0 ";
        if(!error.equals("")) throw new dzielenieZeroException(error);

        float wynik = a / b;
        System.out.println("wynik dzielenia: " + wynik);

        this.a = a;
        this.b = b;
    }
    /*public static void dzielenie(int a, int b) throws dzielenieZeroException{
        String error = " ";
        Scanner skan =  new Scanner(System.in);
        System.out.print("podaj liczbe nr 1: ");
        float a = skan.nextFloat();
        System.out.print("podaj liczbe nr 2: ");
        float b = skan.nextFloat();
        if(b == 0) throw new dzielenieZeroException(error);
        float wynik = a / b;
        System.out.print("wynik dzielenia: " + wynik);

    }
    */

}

class dzielenieZeroException extends java.lang.Exception{
    public dzielenieZeroException(String message){
        super(message);
    }
}
