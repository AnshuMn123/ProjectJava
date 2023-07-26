package inputOutputStream.objectStream;

import java.io.Serializable;

class Student implements Serializable {
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int data = 10;
    public transient int t;

    public Student(){

    }

    public Student (int rollNo, String name, float avg, String dept) {
        this.rollNo = rollNo;
        this.name = name;
        this.avg = avg;
        this.dept = dept;
        data = 500;
        t = 500;
    }

    @Override
    public String toString () {
        return "Student Details  {" +
                "rollNo=" + rollNo +
                ", name='" + name +
                ", avg=" + avg +
                ", dept=" + dept +
                ", data=" + data +
                ", t=" + t +
                '}';
    }
}