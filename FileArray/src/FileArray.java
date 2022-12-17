import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArray {
	
	public static void writeArray(String file, int[] num) {
		
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
			
			for (int numbers : num) {
				output.writeInt(numbers);
			}
			
			output.close();
			System.out.println("Complete.");
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void readArray(String file, int[] num) {
		
		int numbers;
		boolean isEndFile = false;
		
		try {
			
			DataInputStream input = new DataInputStream(new FileInputStream(file));
			
			while(!isEndFile) {
				try {
					 
					numbers = input.readInt();
					System.out.println(numbers + "");
				
				}catch (EOFException e) {
					isEndFile = true;
				}
				
			}
			
			input.close();
			System.out.println("Complete.");
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
