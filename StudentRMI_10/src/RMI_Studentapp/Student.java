package RMI_Studentapp;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}
