package EnumAndVarags;

enum Signal {
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");     // This will call enum constructor with one String argument

    private String action; // declaring private variable for getting values

    public String getAction() {// getter method
        return action;
    }

    private Signal(String action) { // enum constructor - cannot be public or protected
        this.action = action;
    }
}
public class CustomEnum {
    public static void main(String args[]) {
         Signal[] sig = Signal.values();
        for (Signal s : sig) { // use getter method to get the value
            System.out.println("name : " + s.name() + " action: " + s.getAction() );
        }
    }
}
