package oops.encapsulation;

class Student{
    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
public class EncapsulationEx {
    public static void main (String[] args) {
        Student s = new Student();
        s.setName("an");
        System.out.println(s.getName());
    }

}
