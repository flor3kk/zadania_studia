package lab08.cwiczenia_z_domu;

import java.util.Random;

public class cw5 {
    public static void main(String[] args){
        losowanie();
    }

    public static void losowanie(){
        Random rand = new Random();
        int counter = 0;
        while (true) {
            int a = rand.nextInt(21) - 10;
            int b = rand.nextInt(21) - 10;
            try {
                System.out.println("dzielenie " + a + " / " + b + " = " + a / b);
            } catch (ArithmeticException e) {
                System.out.println("wystapiło dzielenie przez zero " + e.getMessage());
                counter++;
            }

            if (counter == 3) break;
        }
    }
}
