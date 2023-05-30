package lab10;

import java.io.*;

public class BinaryFile {

    public int readBinary(String filePath) throws IOException{
        DataInputStream inputStream = null;
        try{
            inputStream = new DataInputStream(new FileInputStream(filePath));
            return inputStream.readInt();
        }finally{
            if ((inputStream != null))
                inputStream.close();
        }
    }

    public void writeBinary(String filePath, int number) throws IOException{
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(filePath));
            outputStream.writeInt(number);
        }finally {
            if ((outputStream != null))
                outputStream.close();
        }
    }


}
