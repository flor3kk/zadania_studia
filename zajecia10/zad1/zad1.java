package lab10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        FileWriter output = null;
        String line;
        System.out.println("podaj sciezke: ");
        try {
            output = new FileWriter(input.nextLine());
            System.out.println("podaj zawarosc pliku, koniec nastapi po nacisnieciu znaku '-' ");

            while (true){
                line = input.nextLine();
                if (line.equals("-")) break;
                output.write(line);
                output.write(System.lineSeparator());
            }

        }finally {
            if (output != null)
                output.close();
        }

    }
}

//sciezka I:\nauka_c\first_project\zad1.txt