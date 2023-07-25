package inputOutputStream.byteArray;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputExample {
    public static void main(String args[])throws Exception{
        FileOutputStream fos1=new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/byteArray/output.txt", true);
        FileOutputStream fos2=new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/byteArray/output.txt", true);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fos1);
        bout.writeTo(fos2);

        bout.flush();
        bout.close();
    }
}
