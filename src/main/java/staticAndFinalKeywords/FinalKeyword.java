package staticAndFinalKeywords;

class Test1 {
    public final void show() {
        System.out.println();
    }
    final int i;
    {
        i = 20;
    }
}

class Test2 extends Test1 {
//    public void show(){} //gives error as final methods cannot be overloaded.
}

public class FinalKeyword {
    final float PI;
    public FinalKeyword() {
        PI=3.1425f;
    }

    public static void main(String[] args) {
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
    }
}
