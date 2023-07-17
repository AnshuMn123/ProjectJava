package innerClass.anonymous;

interface Hello {
    void show();
}

public class AnonymousInnerClassWIthInterface {
    // Class implementing interface
    static Hello h = () -> { // changed to lambda function
            System.out.println("i am in anonymous class");
    };

    public static void main(String[] args) {
        h.show();
    }
}
