package WrapperClass;
import java.io.*;

class Maximum {
    private int maxi = 0;
    private int size = 0;

    public void insert(int x) {
        this.size++;
        this.maxi = Math.max(x, this.maxi);
    }

    public int top() {
        return this.maxi;
    }

    public int elementNumber() {
        return this.size;
    }
};

public class CustomWrapper {
    public static void main(String[] args) {
        Maximum x = new Maximum();
        x.insert(12);
        x.insert(3);
        x.insert(23);

        System.out.println("Maximum element: " + x.top());
        System.out.println("Number of elements inserted: " + x.elementNumber());
    }
}
