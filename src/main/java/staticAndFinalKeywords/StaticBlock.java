package staticAndFinalKeywords;

class A{
    static int s;

    static {
        System.out.println ("static block 1");
        s = 10;
    }

    static {
        System.out.println ("static block 2");
        s = 20;
    }
}

public class StaticBlock {
    public static void main ( String[] args ) {
        System.out.println (A.s);
    }
}
