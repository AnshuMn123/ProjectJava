package collectionAPI.compartorOperator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Child {
    String Name;
    int Age;

    public Child(String Name, Integer Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public Integer getAge() { return Age; }
    public void setAge(Integer Age) { this.Age = Age; }

    public String toString() {
        return "Customer{"  + "Name=" + Name + ", Age=" + Age + '}';
    }
}

class CustomerSorting implements Comparator<Child> {
    @Override
    public int compare(Child c1, Child c2) {
        int NameCompare = c1.getName().compareTo(c2.getName());
        int AgeCompare = c1.getAge().compareTo(c2.getAge());

        return (NameCompare == 0) ? AgeCompare : NameCompare;
    }
}

public class Compare2 {
    public static void main(String[] args) {
        Comparator<Child> comp = (Child c1, Child c2) -> {
                int NameCompare = c1.getName().compareTo(c2.getName());
                int AgeCompare = c1.getAge().compareTo(c2.getAge());

                return (NameCompare == 0) ? AgeCompare : NameCompare;
        };

        List<Child> al = new ArrayList<>();
        al.add(new Child("Ajay", 27));
        al.add(new Child("Sneha", 23));
        al.add(new Child("Simran", 37));
        al.add(new Child("Ajay", 22));
        al.add(new Child("Ajay", 29));
        al.add(new Child("Sneha", 22));

        for (Child c : al)
            System.out.println(c);
        System.out.println();

//        Collections.sort(al, comp);

        al.sort(new CustomerSorting());
        for (Child c : al) 
            System.out.println(c);
    }
}
