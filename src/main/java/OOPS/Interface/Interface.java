import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

enum Level {
    LOW,
    MEDIUM,
    HiGH
}



public class Interface implements Cars, Persons {
    public static void main(String args[]) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("sac");
        array.add("reds");
        array.add("reds");
        array.add("reds");
        array.add("reds");

        Collections.sort(array);
        System.out.println(array);

        Iterator<String> it = array.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

//        System.out.println("iterator " + it.next());


        Interface i = new Interface();
//        i.start();
//        i.run();

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner =  outer.new  InnerClass();
        System.out.println(outer.x + inner.y);
        Level myCar = Level.LOW;
        Level cc = Level.HiGH;

//        for(Level myVar : Level.values()) {
//            System.out.println(myVar);
    }
//    }

    public void start(){
        System.out.println("car");
    }

    @Override
    public void run() {
        System.out.println("run");
    }
}


interface Cars {
    void start();
}

interface Persons{
    void run();
}

class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}