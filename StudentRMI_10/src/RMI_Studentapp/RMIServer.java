package RMI_Studentapp;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Creates RMI registry on the default port 1099
            LocateRegistry.createRegistry(1099);
            
            GradeCalculatorImpl obj = new GradeCalculatorImpl();
            
            // Bind the object instance to the name "GradeService"
            Naming.rebind("rmi://localhost/GradeService", obj);
            
            System.out.println("Grade Calculation Server is ready and running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
