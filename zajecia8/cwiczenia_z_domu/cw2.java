package lab08.cwiczenia_z_domu;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class cw2 {
    public static void main(String[] args) {

        wprowadzInt();
        System.out.println("============================");
        wprowadzFloat();
        System.out.println("============================");
        wprowadzChar();
        System.out.println("============================");
        wprowadzString();
        System.out.println("============================");
        wprowadzDouble();
}

    public static int wprowadzInt() {

        Scanner skan = new Scanner(System.in);
        int liczba;
        while (true) {
            try {
                System.out.println("wprowadz liczbe całkowita: ");
                liczba = skan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("tylko liczby calkowite! " );
                skan.nextLine();

            }
        }
        return liczba;
    }

    public static float wprowadzFloat() {

        Scanner skan = new Scanner(System.in);
        float liczba = 0;
        while (true) {
            try {
                System.out.println("wprowadz liczbe zmiennoprzecinkowa: ");
                liczba = skan.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("tylko liczby typu float! " );
                skan.next();

            }
        }
        return liczba;
    }

    public static char wprowadzChar() {

        Scanner skan = new Scanner(System.in);
        char znak = 'a';
        while (true) {
            try {
                System.out.println("wprowadz znak: ");
                znak = skan.next().charAt(0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("błedyny format " + e.getMessage());
                skan.next().charAt(0);

            }
        }
        return znak;
    }

    public static String wprowadzString() {

        Scanner skan = new Scanner(System.in);
        String ciag = "";
        while (true) {
            try {
                System.out.println("wprowadz ciag znakow: ");
                ciag = skan.next();
                break;
            } catch (InputMismatchException e) {
                System.out.println("błedyny format " + e.getMessage());
                skan.nextLine();

            }
        }
        return ciag;
    }

    public static double wprowadzDouble() {

        Scanner skan = new Scanner(System.in);
        double liczba = 0;
        while (true) {
            try {
                System.out.println("wprowadz liczbe całkowita typu double: ");
                liczba = skan.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("błedyny format " + e.getMessage());
                skan.next();

            }
        }
        return liczba;
    }


}
