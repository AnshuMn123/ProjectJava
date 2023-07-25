package serialization_deserialization.deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Emp implements Serializable {
    public String name;
    public String address;
}

public class Deserialization {
    public static void main(String[] args) {
        Emp em2 = null;
        try {
            FileInputStream file = new FileInputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/Serialization/ct.txt");
            ObjectInputStream obj = new ObjectInputStream(file);
            em2 = (Emp) obj.readObject();
            obj.close();
            file.close();
            System.out.println("hello");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(em2.address);
            System.out.println(em2.name);
        }
    }
}
