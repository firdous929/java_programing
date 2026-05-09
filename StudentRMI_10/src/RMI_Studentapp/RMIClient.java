package RMI_Studentapp;

import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Look up the remote object
            GradeCalculator stub = (GradeCalculator) Naming.lookup("rmi://localhost/GradeService");
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            Student st = new Student(name, marks);
            
            // Remote method invocation
            String result = stub.calculateGrade(st);
            
            System.out.println("\n--- Result from Server ---");
            System.out.println("Student: " + st.name);
            System.out.println("Calculated Grade: " + result);
            
            sc.close();
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}