package oops.polymorphism.dynamicDispatch;

class TV{
    public void show(){
        System.out.println ("tv displayed");
    }
    public void channelChanged(){
        System.out.println ("tv channel changed");
    }
}

class SmartTV extends TV{
    public void show(){
        System.out.println ("smart tv displayed");
    }
    public void channelChanged(){
        System.out.println ("smart tv channel changed");
    }
    public void browser(){
        System.out.println ("smart tv browser");
    }
}

public class DynamicDispatchEx {
    public static void main (String[] args ) {
        TV t = new SmartTV ();
        t.channelChanged ();
        t.show ();
//        t.browser();  // we can call only methods of TV only, or methods that are override in SmartTV
    }
}
