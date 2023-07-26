package inputOutputStream.readerClass.bufferedReaderClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/readerClass/bufferedReaderClass/input.txt"));

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
