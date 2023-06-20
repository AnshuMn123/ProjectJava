package wrapperClass;

import java.util.ArrayList;

public class UnBoxing {
    public static void main(String[] args)
    {
        Character ch = 'a';
        char a = ch; // unboxing - Character object to primitive  conversion

        ArrayList<Integer> arr  = new ArrayList<Integer>();
        arr.add(24);

        int num = arr.get(0); // unboxing because get method returns an Integer object
        System.out.println(num); // printing the values from primitive data types
    }
}

