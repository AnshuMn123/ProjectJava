package Strings;

public class StringBuilderClass {
    public static void main(String arg[]){
        StringBuilder str = new StringBuilder(); // using default constructor
        StringBuilder str2 = new StringBuilder(10); //using StringBuilder(capacity) constructor

        str.append("A");
        System.out.println("In string = " + str.toString());

        str.reverse();
        System.out.println(str);

        str.insert(1, " BCD ");
        System.out.println(str);
    }
}
