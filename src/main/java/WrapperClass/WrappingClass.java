package WrapperClass;
import java.io.*;

public class WrappingClass {
    public static void main(String[] args)
    {
        byte a = 1; // byte data type
        Byte byteobj = Byte.valueOf(a); // wrapping around Byte object


        int b = 10;  // int data type
        Integer intobj = Integer.valueOf(b); // wrapping around Integer object


        float c = 18.6f; // float data type
        Float floatobj = Float.valueOf(c);  // wrapping around Float object


        double d = 250.5; // double data type
        Double doubleobj = Double.valueOf(d); // Wrapping around Double object


        char e = 'a';  // char data type
        Character charobj = e; // wrapping around Character object

        // printing the values from objects
        System.out.println("Byte object byteobj: "  + byteobj);
        System.out.println("Integer object intobj: " + intobj);
        System.out.println("Float object floatobj: "+ floatobj);
        System.out.println("Double object doubleobj: " + doubleobj);
        System.out.println("Character object charobj: " + charobj);

        // objects to data types (retrieving data types from objects) unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;

        System.out.println("\nbyte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}
