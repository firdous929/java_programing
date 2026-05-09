package RMI_Studentapp;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class GradeCalculatorImpl extends UnicastRemoteObject implements GradeCalculator {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7613702407597547077L;

	protected GradeCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public String calculateGrade(Student s) throws RemoteException {
        System.out.println("Server received request for: " + s.name);
        if (s.marks >= 90) return "A+";
        else if (s.marks >= 75) return "A";
        else if (s.marks >= 60) return "B";
        else if (s.marks >= 50) return "C";
        else return "Fail";
    }
}
