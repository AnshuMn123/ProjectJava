package enumAndVarags;

enum Laptop{
    window(20), lenovo(10), mac, asus(12);

    private int price;
     Laptop(){
         price = 22;
     }
    Laptop(int price){
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String arg[]){
        Laptop lap = Laptop.window;
        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop l: Laptop.values()){
            System.out.println(l + " : " + l.getPrice());
        }


    }
}
