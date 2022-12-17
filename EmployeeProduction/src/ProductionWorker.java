public class ProductionWorker extends Employee {
	
	private int shift;
	private double payRate;
	
	public ProductionWorker (String empName, String empNumber, String hireDate, int shift, double payRate) {
		
		super(empName, empNumber, hireDate);
		
		if (shift == 1 || shift == 2) {
			this.shift = shift;
		}	
		
		else {
			System.out.println("Error. Please enter a 1 for day shift or a 2 for night shift.");
			System.exit(0);
		}
		
		if (payRate <= 0) {
			System.out.println("Error. Pay rate must be greater than 0.00.");
			System.exit(0);
		}
		
		else {
			this.payRate = payRate;
		}
		
		
	}
	
	public int getShift() {
		return shift;
	}
	
	public void setShift(int shift) {

		if (shift == 1 || shift == 2) {
			this.shift = shift;
		}	
			else {
				System.out.println("Error. Please enter a 1 for day shift or a 2 for night shift.");
				System.exit(0);
			}
		
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public void setPayRate(double payRate) {
		
		if (payRate <= 0) {
			System.out.println("Error. Pay rate must be greater than 0.00.");
			System.exit(0);
		}
		
		else {
			this.payRate = payRate;
		}
		
	}
	
	public static void main(String[] args) {
		
		ProductionWorker pw = new ProductionWorker ("Kory", "137-D", 
				"11/17/2022", 1, 16.97);
		
		System.out.println("Employee name: " + pw.getEmpName()
				+ "\nEmployee Number: " + pw.getEmpNumber()
				+ "\nEmployee Hire Date: " + pw.getHireDate()
				+ "\nSelected Shift: " + (pw.getShift() == 1 || pw.getShift() == 2 ? "Day" : "Night")
				+ "\npayRate: " + pw.getPayRate());
	}
	
 }
