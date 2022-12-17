package carpetCalculator;
import java.util.Scanner;

public class CarpetCalculatorProgram {
	

	public static void main(String[] args) {
		

	final double CARPET_PRICE_PER_SQFT = 8.0;
		    
		Scanner keyboard = new Scanner(System.in);
		

		    
		System.out.println("This program will display the "
		     + "carpet cost of a room." + "\nPlease enter the room's "
		     + "dimension in feet.");

		    
		System.out.println("Enter the length of room: ");
			double length = keyboard.nextDouble();

		   
		System.out.println("Enter the width of room: ");
			double width = keyboard.nextDouble();
			keyboard.close();

		   CarpetCalculatorProgram calculatorProgram = new CarpetCalculatorProgram();
		   RoomDimension dimensions = new RoomDimension(length,width);
		   RoomCarpet roomCarpet = new RoomCarpet(dimensions, CARPET_PRICE_PER_SQFT);

		    System.out.println(roomCarpet.toString());
	}

}
