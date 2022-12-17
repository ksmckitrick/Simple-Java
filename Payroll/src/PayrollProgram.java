import java.util.Scanner;

public class PayrollProgram {
	
	static payroll payroll = new payroll();
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		employeeInfo(keyboard, payroll);
		
	}

	public static void employeeInfo(Scanner keyboard, payroll payroll) {
		
		int userInput;
			
			do {
				
				System.out.println("1. Enter employee information.");
				System.out.println("2. View employee information.");
				System.out.println("3. Exit.");
				
				userInput = keyboard.nextInt();
				
				switch (userInput) {
			
					case 1: 
						retrieveInfo();
						break;
			
					case 2: 
						viewInfo();
						break;
				}
			}
			
			while (userInput !=3); 
			
	}			
	
	public static void retrieveInfo() {
		
		for (int index = 0; index < 7; index++) {
			System.out.println("Employee " + payroll.getEmployeeId(index));
			System.out.print("Please enter number of hours worked: ");
			
			int hours = keyboard.nextInt();
				
			while (hours < 0 ) {
				System.out.print("Error. Please enter a postive number: ");
				hours = keyboard.nextInt();
			}
				
			payroll.setHours(index, hours);
				
			System.out.print("Please enter the pay rate: ");
			double payrate = keyboard.nextDouble();
				
			while (payrate < 6) {
				System.out.println("Error. Pay rate must be greater then $6.00: ");
				payrate = keyboard.nextDouble();
			}
			
		payroll.setPayRate(index, payrate);
			
		}
		
		System.out.println();
		
		payroll.calculateWages();
	}

	public static void viewInfo() {
		
		for(int index = 0; index < 7; index++) {
			System.out.println("Employee: " + payroll.getEmployeeId(index));
			System.out.println("--------");
			System.out.println("Hours Worked: " + payroll.getHours(index));
			System.out.println("Pay Rate: " + payroll.getPayRate(index));
			System.out.println("Gross Wages: " + payroll.getWages(index));
			System.out.println();
		}
	}
}






