package oops.interfaces;

interface Member{
    void callback();
    int v = 9;
}

class Customer implements Member{
    String name;

    public Customer ( String name ) {
        this.name = name;
    }

    @Override
    public void callback ( ) {
        System.out.println ("Ok, I will visit " + name);

    }
}

class Store{
    Member[] mm = new Member[100];
    int count = 0;

    void register(Member m){
        mm[count++] = m;
    }

    void inviteSale(){
        for(int i = 0; i < count; i++){
            mm[i].callback ();
        }
    }
}

public class CallbackMethod {
    public static void main ( String[] args ) {
        Store s = new Store ();

        Customer c1 = new Customer ("ans");
        Customer c2 = new Customer ("singh");

        s.register (c1);
        s.register (c2);

        s.inviteSale ();
    }
}
