package OOPS.Polymorphism;

class Calc {
    public int Add(int n1, int n2) {
        return n1 + n2;
    }

    public int Add(int n1, int n2, int n3) {
        return n1 +n2 + n3;
    }
}

public class CompileTime{
    public static void main(String args[]){
        Calc obj = new Calc();
        System.out.println(obj.Add(9, 2));
        System.out.println(obj.Add(9, 2, 3));
    }

}
