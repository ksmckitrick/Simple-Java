
public class ShiftSupervisor extends Employee {
	
	private double annSalary;
	private double prodBonus;
	
	public ShiftSupervisor(String empName, String empNumber, String hireDate,
			double annSalary, double prodBonus) {
		
		super(empName, empNumber, hireDate);
		
		this.annSalary = annSalary;
		this.prodBonus = prodBonus;
		
		if (prodBonus <=0) {
			System.out.println("Error. Bonus cannot be $0.00.");
			System.exit(0);
		}
			
			else {
				this.prodBonus = prodBonus;
			}
		
		if (annSalary <=0) {
			System.out.println("Error. Annnual salary cannot be $0.00.");
			System.exit(0);
		}
		
			else {
				this.annSalary =annSalary;
			}
	}
	
	public double getAnnSalary() {
		return annSalary;
	}
	
	public void setAnnSalary(double annSalary) {
		
		if (annSalary <=0) {
			System.out.println("Error. Annnual salary cannot be $0.00.");
			System.exit(0);
		}
		
			else {
				this.annSalary = annSalary;
			}
	}
	
	public double getProdBonus() {
		return prodBonus;
	}
	
	public void setProdBonus(double prodBonus) {
		
		if (prodBonus <=0) {
			System.out.println("Error. Bonus cannot be $0.00.");
			System.exit(0);
		}
			
			else {
				this.prodBonus = prodBonus;
			}
	}
	
	public static void main(String[]args) {
		
		ShiftSupervisor ss = new ShiftSupervisor("Kory", "137-D", "11/17/2022", 
													80000, 3000);
		
		System.out.println("Employee name: " + ss.getEmpName()
		+ "\nEmployee Number: " + ss.getEmpNumber()
		+ "\nEmployee Hire Date: " + ss.getHireDate()
		+ "\nAnnual Salary: " + ss.getAnnSalary()
		+ "\npayRate: " + ss.getProdBonus());
	}
}
