import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEncryptionFilter {
	
	public static void main(String[] args) {
		
		try {
			
			String message = "\\Users\\Kory\\eclipse-workspace\\FileEncryptionFilter\\src/message.txt";
			String secret = "\\Users\\Kory\\eclipse-workspace\\FileEncryptionFilter\\src/secret.txt";
		
			Scanner kb = new Scanner(new File(message));
			StringBuilder sb = new StringBuilder();
			
			while (kb.hasNext()){
				sb.append(kb.nextLine());
			}
			
			String encrypt = "";
			
			for (int i=0; i < sb.length(); i++) {
				
				char ch = sb.toString().charAt(i);
				encrypt += ((char) (ch + 10));
			}
			
			FileWriter fw = new FileWriter(secret);
			fw.write(encrypt);
			
			fw.close();
			
			System.out.println("Message: " + sb.toString()
								+"\nEncrypted Message: " + encrypt);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
