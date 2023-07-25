package threads.synchronization;

class ATM{
    synchronized public void checkBalance(String name) {
        System.out.println(name + " checking");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("balance checking is done for " + name);
    };
    synchronized public void withdraw(String  name, int amount){
        System.out.println(name + " checking");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println(amount);
    };
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;

    public Customer(ATM atm, String name, int amount){
        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    };

    public void run(){
        useATM();
    }
}

public class ATM_Example {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer(atm, "ans", 1000);
        Customer c2 = new Customer(atm, "wer", 2000);
        c1.start();
        c2.start();
    }
}
