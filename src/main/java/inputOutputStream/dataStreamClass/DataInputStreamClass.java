package inputOutputStream.dataStreamClass;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/dataStreamClass/txt.file");
        DataInputStream data = new DataInputStream(file);

        int count = data.available();
        byte[] arr = new byte[count];

        data.read(arr);
        for(byte i : arr){
            System.out.println(i + " " + (char) i);
        }
        data.close();
    }
}
