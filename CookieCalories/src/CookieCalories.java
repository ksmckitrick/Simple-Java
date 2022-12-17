import javax.swing.JOptionPane;

public class CookieCalories {

	public static void main(String[] args) {
	
		
	//Variables
		
	String inputString;
	double amount;
	double cookie;
	double calories;
	double totalCaloriesConsumed;
	
	//Variable values
	
	cookie = 1;
	calories = 75;
	totalCaloriesConsumed = cookie * calories;
	
	
	//User inputs amount of cookies eaten.
	
	inputString = 
		JOptionPane.showInputDialog(null, "How many cookies did you eat?");
		amount = Double.parseDouble(inputString);
	
	//Converts input to double.	
		
		totalCaloriesConsumed = amount * calories;
	
	//Outputs total calories consumed.	
		
		 JOptionPane.showMessageDialog(null," You consumed " + totalCaloriesConsumed
				 +" calories.");
		
	
	}
}
