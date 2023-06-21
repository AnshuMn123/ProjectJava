package collectionAPI;

class Child {
    public String name;
    public int id;

    Child(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) // checking if both the object references are referring to the same object.
            return true;

        // it checks if the argument is of the type Child by comparing the classes of the passed argument and this object.
        // if(!(obj instanceof Child)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;


        Child child = (Child) obj; // type casting of the argument.
        return (child.name == this.name && child.id == this.id); // comparing the state of argument with the state of 'this' Object.
    }

    @Override
    public int hashCode() {
        // We are returning the child_id as a hashcode value. we can also return some other calculated value or may
        // be memory address of the Object on which it is invoked. it depends on how you implement hashCode() method.
        return this.id;
    }

}

public class EqualAndHasCode {
    public static void main (String[] args){
        Child c1 = new Child("aa", 1);
        Child c2 = new Child("aa", 1);

        if(c1.hashCode() == c2.hashCode()){
            if(c1.equals(c2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
        }
        else
            System.out.println("Both Objects are not equal. ");
    }
}
