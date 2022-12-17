import java.util.Scanner;

public class rainfall {

	public void runRainfall() {

		try (Scanner keyboard = new Scanner(System.in)) {
			double[] rain = new double[12];
			double sum = 0;
			double average = 0;
			int maxIndex = 0;
			int minIndex = 0;
			
			System.out.println("Please enter the total amount of rainfall, in inches, for the following months: ");
			
			String months[] = {"January", "February", "March", "April", "May",
					"June", "July", "August", "September", "October",
					"November", "December"};
			
			for (int iMonths= 0; iMonths<months.length; iMonths++) {
				System.out.println(months[iMonths]+" :");
				double val = keyboard.nextDouble();
				
				if (val < 0) {
					System.out.println("Error: Negative rainfall is not possible. Please enter a positive number in inches.");
					val = keyboard.nextDouble();
				}
				
				rain[iMonths]=val;
				sum+=val;
				
			}
			
			average = sum/12;
			maxIndex = getMaxIndex(rain);
			minIndex = getMinIndex(rain);
			String maxMonth = months[maxIndex];
			String minMonth = months[minIndex];
			
			System.out.println("The total rainfall for the year was " + sum + " inches.");
			System.out.println("The average rainfall for the year was " + average + " inches.");
			System.out.println("The month with the most rain was " + maxMonth + ".");
			System.out.println("The month with the least rain was " + minMonth + ".");
		}
	}
	
	private static int getMaxIndex(double[] rain) {
		
		int index = 0;
	    double max = rain[index];

	    for (int i = 1; i < rain.length; i++){
	        
	    	if (rain[i] >= max){
	        max = rain[i];
	        index = i;
	        }
	    }
	        return index; 
	}
	
	
	private static int getMinIndex(double[] rain) {
		
		int index = 0;
	    double min = rain[index];

	    for (int i = 1; i < rain.length; i++){
	        
	    	if (rain[i] <= min){
	        min = rain[i];
	        index = i;
	        }
	    }
	        return index; 
	}

}
