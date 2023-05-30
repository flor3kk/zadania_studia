package lab10;

import java.io.*;
import java.util.Scanner;

public class TextFile {


    public void ReadFile() throws IOException{

        //odczyt z pliku
        File file = new File("test.txt");

        Scanner skan = new Scanner(file);

        String text = skan.nextLine();
        System.out.println(text);

    }
    public void SaveFile() throws IOException{

        //zapis
        PrintWriter zapis = new PrintWriter("test.txt");
        zapis.println("cos tam blabla");
        zapis.close();
    }

    public void SaveFileWriter() throws IOException {

        String filePath = "test.txt";
        int numer = 123;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(numer));
        }finally {
            if ((filePath != null))
                fileWriter.close();

        }
    }

    public int ReadBuffer() throws IOException{

        String filePath = "test.txt";
        int number = 0;
        BufferedReader fileReader = null;

        try{
            fileReader = new BufferedReader(new FileReader(filePath));
            String numberAsString = fileReader.readLine();
            number = Integer.parseInt(numberAsString);
        }finally {
            if ((filePath != null))
                fileReader.close();
        }
        return number;

    }

}
