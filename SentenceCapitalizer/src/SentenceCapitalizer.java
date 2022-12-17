import java.util.Scanner;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your sentence: ");
		String str = kb.nextLine();
		
		int pos = 0;
		boolean capitalize = true;
		StringBuilder sb = new StringBuilder(str);
		
		while (pos < sb.length()) {
			
			if(sb.charAt(pos) == '.' || sb.charAt(pos) == '?' || sb.charAt(pos) == '!' ) {
				capitalize = true;
			}
			
			else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
			sb.setCharAt(pos,  Character.toUpperCase(sb.charAt(pos)));
			capitalize = false;
			}
			
			pos++;
		}
		
		System.out.println(sb.toString());
		
	}
}
