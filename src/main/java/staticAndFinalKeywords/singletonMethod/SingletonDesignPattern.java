package staticAndFinalKeywords.singletonMethod;

class Database{
    private Database() {};
    private static Database dbObject;

    public static Database getInstance(){
        if(dbObject == null){
            dbObject = new Database();
        }
        return dbObject;
    }
    public void getConnection(){
        System.out.println("connection to database created Successfully");
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Database db1;
        db1 = Database.getInstance();
        db1.getConnection();
    }
}

