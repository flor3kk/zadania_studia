import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class lab04_cw4 {

    public static void main(String[] args){
        System.out.println("podaj 5 słów: ");
        String[] tab = new String[5];
        tabIn(tab);
    }

    public static String inputStr(){
        Scanner skan = new Scanner(System.in);
        String item = skan.next();
        return item;
    }


    public static String reverseString(String slowo){
        StringBuilder reverse = new StringBuilder(slowo);
        return reverse.reverse().toString();
    }
    public static void tabIn(String[] tab){
        for(int i = 0; i < tab.length; i++){
            tab[i] = inputStr();
        }

        /*for (int i = tab.length -1; i >= 0; i--){
            System.out.print(tab[i].length());
            for(int j = tab[i].length() - 1; j >= 0; j--){
                System.out.print(tab[j]);
            }
            System.out.println();
           }*/

        for (int i = tab.length - 1; i >= 0; i--) {
            String reversed = reverseString(tab[i]);
            System.out.println(reversed);
        }
    }

}
