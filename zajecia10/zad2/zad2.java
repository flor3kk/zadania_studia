package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) throws IOException {

        Scanner skan = new Scanner(System.in);
        BufferedReader inputFile = null;
        int number = 0;
        String line;

        System.out.println("podaj sciezke: ");
        try {
            inputFile = new BufferedReader(new FileReader(skan.next()));
            System.out.println("zawartosc pliku:");

            while (true){
                line = inputFile.readLine();
                if (line == null) break;
                number++;
                System.out.println(line);
            }

        }finally {
            if (inputFile != null)
                inputFile.close();
        }

        System.out.println("plik zawiera: " + number + " linijek");
        }

}


//sciezka I:\nauka_c\first_project\zad2.txt