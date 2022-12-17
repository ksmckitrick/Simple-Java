public class InvalidTestScore extends Exception{

	public InvalidTestScore() {
		
		super("Error: Test score is invalid.");
	}
	
	public InvalidTestScore(double score) {
		
		super("Error: Test score ("+score+") is invalid.");
	}
}