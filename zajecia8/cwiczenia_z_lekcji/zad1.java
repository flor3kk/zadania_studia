package lab08.cwiczenia_z_lekcji;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad1 {

    public static void main(String[] args){
        zadanie1();
    }

    public static void zadanie1(){
        System.out.println("podaj liczbe: ");
        Scanner skan = new Scanner(System.in);
        double userInput = 0;
        while (true){
            try{
                userInput = skan.nextDouble();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("podaj poprawna liczbe" );
                skan.next();
            }
        }

        if(userInput < 0)
            throw new IllegalArgumentException(String.format("pierwiatek kwadratowy z liczby %.4f nie istnieje", userInput));
        System.out.print(String.format("pierwiatek z %.4f = %.4f", userInput, Math.sqrt(userInput)));
    }
}
