package exp3;
	public class Employee {
		int id;
		String name; 
		double salary;

		// Constructor
		Employee(int id, String name, double salary) { 
			this.id = id;
		    this.name = name; 
		    this.salary = salary;
		}

		// Method to display employee details 
		void displayDetails() {
		System.out.println("ID: " + id); 
		System.out.println("Name: " + name); 
		System.out.println("Salary: " + salary);
		}

		// Method Overloading (same method name, different parameters) 
		void calculateSalary(double bonus){
		 System.out.println("Total Salary with Bonus: " + (salary + bonus));
		}

		void calculateSalary(double bonus, double allowance) {
		   System.out.println("Total Salary with Bonus & Allowance: " + (salary + bonus +
	    allowance));
		}

		// Method to be overridden 
		void work(){
		  System.out.println("Employee works in the company");
		 }
	   }
		 
		// Manager class (Inheritance)
		    class Manager extends Employee { 
		       String department;
		

		Manager(int id, String name, double salary, String department) {
			super(id, name, salary);
		    this.department = department;
		}

		// Method Overriding 
		void work(){
		System.out.println("Manager manages the " + department + " department");
		}
	  }
		  

		// Developer class (Inheritance) 
		class Developer extends Employee {
		  String language;

		Developer(int id, String name, double salary, String language) {
			super(id, name, salary);
		    this.language = language;
		}

		 // Method Overriding 
		  void work(){
		  System.out.println("Developer writes code in " + language);
		  }
	    }
		class EmployeeManagement {
		  public static void main(String[] args){

		// Manager object
		Manager m = new Manager(100, "Firdous", 95000, "HR");
		m.displayDetails();
		m.work();
		m.calculateSalary(5000); 
		System.out.println();


		// Developer object
		Developer d = new Developer(101, "Maryam", 77000, "Manager");
		d.displayDetails();
		d.work();
		d.calculateSalary(5000, 3000);
		
		  }
	   }
		

