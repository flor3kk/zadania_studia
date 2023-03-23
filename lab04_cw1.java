import java.awt.*;
import java.util.Random;

public class lab04_cw1 {

    public static void main(String[] args){
        int[] tab = new int[10];
        rand(tab);

    }

    public static void rand(int[] tab){
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(50)-10;
            System.out.println(tab[i] + " ");
        }

        int sum = 0;
        int count = 0;
        for (int item: tab) {
            sum += item;
            count++;
        }

        System.out.println("srednia w tablicy: " + (sum/count));
    }
}
