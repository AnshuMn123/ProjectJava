package oops.inheritance;

class  Account {
    private int accNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    protected long balance;

    public Account (int accNo, String name, String address, String phoneNo, String dob) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        balance=0;
    }

    public int getAccNo () {
        return accNo;
    }
    public String getName () {
        return name;
    }
    public String getAddress () {
        return address;
    }
    public String getPhoneNo () {
        return phoneNo;
    }
    public String getDob () {
        return dob;
    }
    public long getBalance(){
        return balance;
    }

    public void setAddress(String address) {
        this.address=address;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo=phoneNo;
    }
}

class SavingsAccount extends Account {

    public SavingsAccount (int accNo, String name, String address, String phoneNo, String dob) {
        super(accNo, name, address, phoneNo, dob);
    }

    public void deposit(long amt) {
        balance+=amt;
    }
    public void withdraw(long amt) {
        balance-=amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount (int accNo, String name, String address, String phoneNo, String dob) {
        super(accNo, name, address, phoneNo, dob);
    }

    public void payEMI(long amt) {
        balance -= amt;
    }
    public void repay(long amt) {
        if(balance == amt)
            balance=0;
    }
}

public class AccountDetails  {
    public static void main (String[] args) {

    }
}
