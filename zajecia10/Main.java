package lab10;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        TextFile file = new TextFile();
        /*file.ReadFile();
        file.SaveFile();
        file.ReadFile();
        file.SaveFileWriter();
        file.ReadFile();
        */

        BinaryFile binFile = new BinaryFile();

        int number = 123321;
        String path = "testBinary.bin";

        binFile.writeBinary(path, number);
        System.out.println(binFile.readBinary(path));
    }

}
