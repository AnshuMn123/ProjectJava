package inputOutputStream.objectStream.CustomerClassSerialization;

import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable {
    String cusId;
    String name;
    String phoneNo;

    static int count = 1;

    public Customer () {
    }

    public Customer (String name, String phoneNo) {
//        cusId = UUID.randomUUID().toString();
        cusId = "C" + count;
        count++;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString () {
        return "Customer{" +
                "cusId = " + cusId +
                ", name = " + name +
                ", phoneNo = " + phoneNo +
                '}';
    }
}
