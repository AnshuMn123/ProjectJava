package oops.interfaces;

interface X {
    default void show() {
        System.out.println("Default X");
    }
}

interface Y {
    default void show() {
        System.out.println("Default Y");
    }
}

//Should not be used directly;
class AmbidexterityMultipleInheritance implements X, Y {
    @Override
    public void show ( ) {
        X.super.show ();
        Y.super.show ();
    }

    public void showOfX ( ) {
        X.super.show ();
    }

    public void showOfY ( ) {
        Y.super.show ();
    }

    public static void main(String args[]) {
        AmbidexterityMultipleInheritance d = new AmbidexterityMultipleInheritance();
        d.show();
        d.showOfX();
        d.showOfY();
    }
}

