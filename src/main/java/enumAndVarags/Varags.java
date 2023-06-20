package enumAndVarags;

public class Varags {
    static void fun(int... a) {
        System.out.println("Number of arguments: "  + a.length);


        for (int i : a){  // using for each loop to display contents of a
            System.out.println(i + " ") ;
        }
    }

    public static void main(String args[]) {
        fun(100); // one parameter
        fun(1, 2, 3, 4); // four parameters
        fun(); // no parameter
    }
}
