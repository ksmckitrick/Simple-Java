public class Employee {
	
	private String empName;
	private String empNumber;
	private String hireDate;
	

	public Employee (String empName, String empNumber, String hireDate) {
	
		this.empName = empName;
		this.empNumber = empNumber;
		
		if (empNumber.length() < 5) {
			System.out.println("Error: Employee number must be in the NNN-L format.");
			System.exit(0);
		}
		
		else {
			
			String num = empNumber.substring(0,3);
			String let = empNumber.substring(4);
			
			if (num.matches("^[0-9]*")) {
				this.empNumber = empNumber;
			}
			
			else {
				System.out.println("Error. First three characters of the employee number must be 0-9.");
				System.exit(0);
			}
			
			if (let.matches("^[A-M]*$")) {
				this.empNumber = empNumber;
			}
			
			else {
				System.out.println("Error. Final character of the employee number must be A-M.");
				System.exit(0);
			}
		}
	
		this.hireDate = hireDate;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpNumber() {
		return empNumber;
	}
	
	public void setEmpNumber (String empNumber) {
		
		if (empNumber.length() < 5) {
			System.out.println("Error: Employee number must be in the NNN-L format.");
			System.exit(0);
		}
		
		else {
			
			String num = empNumber.substring(0,3);
			String let = empNumber.substring(4);
			
			if (num.matches("^[0-9]*")) {
				this.empNumber = empNumber;
			}
			
			else {
				System.out.println("Error. First three characters of the employee number must be 0-9.");
				System.exit(0);
			}
			
			if (let.matches("^[A-M]*$")) {
				this.empNumber = empNumber;
			}
			
			else {
				System.out.println("Error. Final character of the employee number must be A-M.");
				System.exit(0);
			}
		}
		
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
}
