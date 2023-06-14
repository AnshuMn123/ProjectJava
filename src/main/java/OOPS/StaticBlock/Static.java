package StaticBlock;

class Mobile{
    int price;
    static String brand;

    static String name;

    static{
        brand = "phone";
        System.out.println("static");
    }

    public Mobile(){
        price = 100;
        name = "ans";
        System.out.println("public");

    }

    void show() {
        System.out.println(brand + " : " + name + " : " + price );
    }
    static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + name + " : " + obj.price );
    }


}
public class Static{
//    public static void main(String args[]) throws ClassNotFoundException {

    public static void main(String args[])  {

//        Class.forName("Mobile");
        Mobile mb = new Mobile();
        mb.show();

        Mobile.show1(mb);

    }
}
