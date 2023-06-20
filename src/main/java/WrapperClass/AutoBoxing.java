package WrapperClass;

import java.util.ArrayList;

public class AutoBoxing {
    public static void main(String[] args)
    {
        char ch = 'a';
        Character a = ch; // Autoboxing- primitive to Character object conversion

        ArrayList<Integer> arr  = new ArrayList<Integer>();
        arr.add(25); // Autoboxing because ArrayList stores only objects

        System.out.println(arr.get(0));  // printing the values from object
    }
}
