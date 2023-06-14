package OOPS;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }

    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }

}
public class ToStirngAndHashcode {
    public static void main(String a[]){

        Laptop l1 = new Laptop();
        l1.model = "A1";
        l1.price = 100;

        System.out.println(l1.toString()); // Laptop@251a69d7 givig this value bydefault bcase of inbuilt function

        Laptop l2 = new Laptop();
        l2.model = "A1";
        l2.price = 100;

        System.out.println(l1.equals(l2));  // it will give false(there referece is diff) but after write self code for equal it wil give true


    }
}
