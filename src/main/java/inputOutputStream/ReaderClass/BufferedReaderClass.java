package inputOutputStream.ReaderClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/ReaderClass/input.txt"));

        char array[] = new char[100];
        System.out.println(br.ready());
        br.read(array);
        System.out.println(String.valueOf(array));

            // or
        String data = "";
        while ((data = br.readLine()) != null){
            System.out.println(data);
        }
        br.close();
    }
}
