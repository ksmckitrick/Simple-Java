
public class FileArrayApp {

	public static void main(String[] args) {
		
		String file = "\\Users\\Kory\\eclipse-workspace\\FileArray\\src/Numbers.dat";
		int[] numbers = {167, 25, 93, 89, 20};
		
		FileArray.writeArray(file, numbers);
		
		FileArray.readArray(file, numbers);
	}

}
