package Enum;

enum Status{
    Running, driving, sleeping, eating;
}
public class Enum {
    public static void main(String arg[]){

        Status s = Status.driving;
        System.out.println(s);
        System.out.println(s.ordinal()); // ordinal is used for getting index of constant in enum

        Status[] ss = Status.values(); // values will give all enums

        for(Status it : ss){
            System.out.println(it + " : " + it.ordinal());
        }

        Status constant =Status.driving;

        switch(constant)
        {
            case Running:
                System.out.println("All Good");
                break;

            case driving:
                System.out.println("driving");
                break;

            case sleeping:
                System.out.println("sleeping");
                break;

            case eating:
                System.out.println("eating");
                break;

            default:
                System.out.println("Done");
                break;
        }

    }
}
