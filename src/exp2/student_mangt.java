package exp2;


import java.util.*;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class student_mangt {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "shifa", 85));
        students.add(new Student(102, "saniya", 92));
        students.add(new Student(103, "firdous", 78));
        students.add(new Student(104, "nuzhat", 88));

        System.out.println("Original List:");
        for(Student s : students)
            System.out.println(s);

        
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("\nSorted by Name:");
        for(Student s : students)
            System.out.println(s);

        
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.marks - s1.marks;
            }
        });

        System.out.println("\nSorted by Marks (High to Low):");
        for(Student s : students)
            System.out.println(s);
    }
}








