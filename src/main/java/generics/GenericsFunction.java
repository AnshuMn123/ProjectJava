package generics;

public class GenericsFunction {
    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName()  + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay(11); // Calling generic method with Integer argument
        genericDisplay("aa"); // Calling generic method with String argument
        genericDisplay(1.0); // Calling generic method with double argument
    }
}

