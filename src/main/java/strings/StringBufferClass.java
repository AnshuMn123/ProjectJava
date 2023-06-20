package strings;

public class StringBufferClass {
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer();
        sb.append("Hello ");
        sb.append("World");
        System.out.println(sb);

        String s = sb.toString(); // to change stringbuffer into string
        System.out.println(s);

        sb.insert(1, "Java"); // for inserting at index start
        System.out.println(sb);

        sb.replace(1, 3, "Java"); //replaces the given string from the specified start and end - 1.
        System.out.println(sb);

        sb.delete(1, 3); // deletes the string from the specified start to end - 1.
        System.out.println(sb);

        sb.reverse(); //reverses the current string
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity()); // default 16, so 16*2 + 2
        System.out.println(new StringBuffer().capacity()); // default 16

       // capacity() returns the current capacity of the buffer. The default capacity of the buffer is 16.
        // If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.
       // For instance, if your current capacity is 16, it will be (16*2)+2=34.


    }
}
