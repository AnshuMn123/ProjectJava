package Inheritance;


class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}


class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}


public class Inheritance
{
    public static void main(String a[])
    {
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);

        System.out.println(r1 + " " + r2 + "  " + r3 + " " + r4);

    }
}

