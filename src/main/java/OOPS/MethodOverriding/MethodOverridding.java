package OOPS.Inheritance;

class Calci
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalci extends Calci
{
    public int add(int n1, int n2)
    {
        return n1+n2+1;
    }
}


public class MethodOverridding{
    public static void main(String args[])
    {
        AdvCalci obj=new AdvCalci();
        int r1=obj.add(3, 4);
        System.out.println(r1);
    }
}
