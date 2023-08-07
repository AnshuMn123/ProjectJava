package staticAndFinalKeywords.singletonMethod;

class CoffeeMachine{
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;

    private CoffeeMachine(){
        waterQty = 1;
        sugarQty = 1;
    }

    public void fillWaterQty ( float waterQty ) {
        this.waterQty = waterQty;
    }

    public void fillSugarQty ( float sugarQty ) {
        this.sugarQty = sugarQty;
    }

    public float getCoffeeQty ( ) {
        return 0.23f;
    }

    static  CoffeeMachine getInstance  () {
        if(my == null){
            my = new CoffeeMachine ();
        }
        return my;
    }
}

public class SingletonEx {
    public static void main ( String[] args ) {
        CoffeeMachine c1 = CoffeeMachine.getInstance ();
        CoffeeMachine c2 = CoffeeMachine.getInstance ();
        CoffeeMachine c3 = CoffeeMachine.getInstance ();

        System.out.println (c1 + " " + c2 + " " + c3);
        if(c1 == c2 && c1 == c3){
            System.out.println ("same");
        }
    }
}
