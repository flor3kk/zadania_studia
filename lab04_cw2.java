import java.awt.*;
import java.util.Random;

public class lab04_cw2 {

    public static void main(String[] args){
        int[] tab1 = {1,2,3,4,5,6,7,8};
        int[] tab2 = {10,11,12,13,14,15,16};

        for (int i = 0; i < tab1.length; i+=2) {
            System.out.print(tab1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < tab2.length; i+=2){
            System.out.print(tab2[i] + " ");
        }
    }

}
