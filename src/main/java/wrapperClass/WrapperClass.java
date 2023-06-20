package wrapperClass;

public class WrapperClass {
    public static void main(String a[]){

        int num = 7;
        Integer num1 = 8;
        Integer num2 = num; // auto-boxing

        int num3 = num1; // auto-unboxing // we should do it like (int) num1 but it is auto unboxing so it will work fine also

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        String str = "12";
        Integer n = Integer.parseInt(str);
        System.out.println(n*12);






    }

}
