package RMI_Studentapp;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GradeCalculator extends Remote {
    String calculateGrade(Student s) throws RemoteException;
}