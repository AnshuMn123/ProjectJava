package serialization_deserialization.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Emp implements Serializable {
    public String name;
    public String address;
}

public class Serialization {
    public static void main(String[] args) {
        Emp em = new Emp();
        em.name = "An";
        em.address = "SS";

        try {
            FileOutputStream file = new FileOutputStream("/home/asingh/codebase/ProjectJava/src/main/java/inputOutputStream/Serilization/ct.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(em);
            obj.close();
            file.close();
            System.out.println("hello");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
