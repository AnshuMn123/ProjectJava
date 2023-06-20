package enumAndVarags;

enum Color {
    RED, GREEN, BLUE;

    private Color() { // enum constructor called separately for each constant
        System.out.println("Constructor called for : "  + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class EnumInMethod {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
