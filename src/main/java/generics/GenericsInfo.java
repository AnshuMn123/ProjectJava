package generics;

class Test<T> {
    T name;
    Test(T name) { 
        this.name = name; 
    }
    public T getName() {
        return this.name;
    }
}

public class GenericsInfo {
    public static void main(String[] args) {
        Test<Integer> obj = new Test<Integer>(15);
        System.out.println(obj.getName());

        Test<String> obj1  = new Test<String>("A");
        System.out.println(obj1.getName());
    }
}
