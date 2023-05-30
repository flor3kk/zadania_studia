package lab10;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) throws IOException {

        String path;
        Scanner skan = new Scanner(System.in);

        System.out.println("podaj sciezke do pliku: ");
        path = skan.next();

        DataInputStream inputStream = null;
        try{
            inputStream = new DataInputStream(new FileInputStream(path));
            System.out.println("dzien: " + inputStream.readInt());
            System.out.println("miesiac: " + inputStream.readInt());
            System.out.println("rok: " + inputStream.readInt());
        }finally{
            if ((inputStream != null))
                inputStream.close();
        }
    }
}

// I:\nauka_c\first_project\plik1.bin