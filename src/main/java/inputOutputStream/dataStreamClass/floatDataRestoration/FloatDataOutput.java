package inputOutputStream.dataStreamClass.floatDataRestoration;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FloatDataOutput {
    public static void main (String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/dataStreamClass/floatDataRestoration/FloatData.txt");
        DataInputStream ds = new DataInputStream(fis);

        int l = ds.readInt();
        for (int i = 0; i < l; i++) {
            System.out.println(ds.readFloat());
        }
        fis.close();
        ds.close();
    }
}
