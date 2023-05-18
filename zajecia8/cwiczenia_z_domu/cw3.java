package lab08.cwiczenia_z_domu;

import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) {
        zad();
    }

    public static void zad() {
        int[] tab = new int[]{1, 2, 3, 4, 5};
        Scanner skan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("podaj ktory index chcesz wyswietlic:");
                int a = skan.nextInt();
                System.out.println("oto liczba na tym indexie: " + tab[a]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ten index jest poza zakresem" + e.getMessage());
                break;
            }
        }
    }
}




