
public class TestScoreCustomException {
	
	private int[] testScores;
	
	public TestScoreCustomException(int[] testScores) throws InvalidTestScore {
		
		for (int i=0; i<testScores.length; i++) {
			int score= testScores[i];
			
			if (score < 0) {
				throw new InvalidTestScore();
			}
			
			if (score > 100) {
				throw new InvalidTestScore();
			}
		}
		
		this.testScores = testScores;
		
	}
	
	public double getAverage() {
		
		double av = 0;
		
		for (int i=0; i<testScores.length; i++) {
			av+= testScores[i];
		}
		
		return av/testScores.length;
	}
}