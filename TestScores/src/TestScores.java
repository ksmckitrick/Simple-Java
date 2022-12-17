public class TestScores {
	
		double score1;
		double score2;
		double score3;
		double average;
		
		public TestScores (double score1, double score2, double score3) {
			this.score1=score1;
			this.score2=score2;
			this.score3=score3;
		}


		public void get_score1() {
			}
		
		public void get_score2() {
			}
		
		public void get_score3() {
		}
	
		public double get_average() {
			average=(score1 + score2 +score3) / 3.0;
			return average;
		}
		
		public String get_letterGrade() {
			
			String grade = "";
			
			if (average>=90) {
				grade="A";
			}
			
			else if (average>=80&& average<=89) {
				grade="B";
			}
			
			else if (average>=70&& average<=79) {
				grade="C";
			}
			
			else if (average>=60&& average<=69) {
				grade="D";
			}
			
			else if (average<=59) {
				grade="F";
			}
			
			return grade;
		}
		
}

	



