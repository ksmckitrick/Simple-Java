
public class TestScoreCustomExceptionApp {
	
	public static void main(String[] args) {
		
		try {
			
			TestScoreCustomException ts = new
					TestScoreCustomException(new int[]{95, 83, 86, 79, 73});
			
			System.out.println("Avg: " + ts.getAverage());
		
		}catch(InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}