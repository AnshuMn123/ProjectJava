package inputOutputStream.dataStreamClass;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamClass {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/dataStreamClass/txt.file");
        DataOutputStream data = new DataOutputStream(file);

        data.write(65);
        data.writeBoolean(false);
        data.writeChar('c');
        data.writeFloat(10.1f);
        data.writeDouble(10.2);
        data.writeChars("adcscac");
        data.writeInt(1);
        data.close();
    }
}
