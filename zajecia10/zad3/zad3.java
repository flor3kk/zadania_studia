package lab10;

import java.io.*;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) throws IOException{

        int dzien, miesiac, rok;
        String fileName;
        Scanner skan = new Scanner(System.in);

        System.out.println("podaj nazwe pliku: ");
        fileName = skan.next();

        System.out.println("podaj dzien: ");
        dzien = skan.nextInt();
        //String dzienBin = Integer.toBinaryString(dzien);

        System.out.println("podaj mieisac: ");
        miesiac = skan.nextInt();
        //String miesBin = Integer.toBinaryString(miesiac);

        System.out.println("podaj rok: ");
        rok = skan.nextInt();
        //String rokBin = Integer.toBinaryString(rok);

        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream(fileName));

            output.writeInt(dzien);
            output.writeInt(miesiac);
            output.writeInt(rok);

            //output.write(dzienBin.getBytes());
            //output.write(miesBin.getBytes());
            //output.write(rokBin.getBytes());

        } finally {
            if ((output != null))
                output.close();
            }

    }
}
