package strings;

public class StringCreation {
    public static void main(String a[]){
        String s = "SA";
        s.concat("ADS"); // this will not work, so string is immutable
        System.out.println(s);

         s = s.concat("ADS"); // this will  work, because we are creating new object of string s
        System.out.println(s);




        String s1 = "A"; // it will create string in string constant pool
        System.out.println("String s1 = " + s1);

        String s2 = new String("A"); // it will create in heap
        System.out.println("String s2 = " + s2);

        String s3 = s2.intern(); // it will add string to String constant pool from heap
    }


}
