package inputOutputStream.dataStreamClass.floatDataRestoration;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FloatDataInput {
    public static void main (String[] args) throws IOException {
        Float f[] = {10.3f, 12.3f, 12.1f, 12.3f};
        FileOutputStream fos = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/dataStreamClass/floatDataRestoration/FloatData.txt");
        DataOutputStream ds = new DataOutputStream(fos);

        ds.writeInt(f.length);
        for(float x: f){
            ds.writeFloat(x);
        }
        fos.close();
        ds.close();
    }
}
