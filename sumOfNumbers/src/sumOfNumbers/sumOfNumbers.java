package sumOfNumbers;

import java.util.Scanner;

public class sumOfNumbers {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a positive nonzero integer: ");
		
		int num = keyboard.nextInt();
		int sum = 0;
		
				
		while(num >=1 ) {
			sum += num;
			num--;
	}
		
		System.out.println("Sum:" + sum);
	}
}
