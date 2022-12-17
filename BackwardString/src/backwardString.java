import java.util.Scanner;

public class backwardString {
	
	public static void main(String[] args) {
		
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Please enter a word: ");
			String str = keyboard.nextLine();
			
			System.out.println(getBackwardString(str));
		}
	}

	
	private static String getBackwardString (String str) {
		
		String output = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			output += str.charAt(i);
		}
		
		return output;
		
	}
}
