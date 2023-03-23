import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class lab04_cw5 {

    public static void main(String[] args){
        int[] tab = new int[8];
        System.out.println("podaj liczby do twojej tablicy:");
        tabin(tab);
        sort(tab);
    }

    public static int InputInt(){
        Scanner skan = new Scanner(System.in);
        int a = skan.nextInt();
        return a;
    }

    public static void tabin(int[] tab){
        for(int i = 0; i < tab.length; i++){
            tab[i] = InputInt();
        }
    }

    //SORTOWANIE BABELKOWE
    public static void sort(int[] tab){
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0; j < tab.length - i - 1; j++){
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }

        System.out.println("oto twoja posortowana tablica");
        for(int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }

}
