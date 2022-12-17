package hotelOccupancy;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class hotelOccupancy {

	public static void main(String[] args) {
		
	int floors;
	double rooms = 0;
	int roomsOccupied = 0;
	double totalRooms = 0;
	double totalRoomsOccupied = 0;
	double totalVacant = 0;
	double occupancyRate = 0;
		
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter the number of floors in the hotel: ");
	floors = input.nextInt();
		
		while(floors < 1) {
			System.out.print("Error. Please enter a number greater than 0: ");
			floors = input.nextInt();
		}
		
		for(int i=0; i<floors; i++) {
			System.out.print("Enter the number of rooms (Floor " + 
					(int)(i + 1) + "): ");
			rooms = input.nextInt();
		
		while (rooms < 10) {
			System.out.print("Error. Please enter a number of rooms greater than 9 \n(Floor " + 
					(int)(i + 1) + "): ");
			rooms = input.nextInt();
		
		}
		
		System.out.print("Enter the number of rooms occupied(Floor " 
				+ (int)(i + 1) + "): ");
			roomsOccupied = input.nextInt();
		
			totalRooms += rooms;
			totalRoomsOccupied += roomsOccupied;
			
		}
			totalVacant = totalRooms - totalRoomsOccupied;
			occupancyRate = ((totalRoomsOccupied/totalRooms)*100);
			
			NumberFormat df = DecimalFormat.getInstance();
			df.setMaximumFractionDigits(2);
		
			System.out.println("Total Rooms: " + totalRooms + "\nOccupied(QTY): " + totalRoomsOccupied + 
			"\nVacant Rooms(QTY): " + totalVacant + "\nOccupancy Rate: " + df.format(occupancyRate) + "%");
		
	}
}

