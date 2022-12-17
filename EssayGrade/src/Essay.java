import java.util.Scanner;


public class Essay extends GradeActivity {
	
	private int gramPoints = 0;
	private int spellPoints = 0;
	private int contentLengthPoints = 0;
	private int contentPoints = 0;
	
	public Essay(double score, int gramPoints, int spellPoints, int contentLengthPoints,
			int contentPoints) {
		
		super(score);
		
		this.gramPoints = gramPoints;
		this.spellPoints = spellPoints;
		this.contentLengthPoints = contentLengthPoints;
		this.contentPoints = contentPoints;
		
		
		/*Grammar Points Validation*/
		
		if (gramPoints > 30) {
			System.out.println("Error. Maximum amount of points earned in Grammar is 30.");
			System.exit(0);
		}
		
		else {
			this.gramPoints = gramPoints;
		}
		
		/*Spelling Points Validation*/
		
		if (spellPoints > 20) {
			System.out.println("Error. Maximum amount of points earned in Spelling is 20.");
			System.exit(0);
		}
		
		else {
			this.spellPoints = spellPoints;
		}
		
		/*Content Length Points Validation*/
		
		if (contentLengthPoints > 20) {
			System.out.println("Error. Maximum amount of points earned through content length is 20.");
			System.exit(0);
		}
		
		else {
			this.contentLengthPoints = contentLengthPoints;
		}
		
		/*Content Points Validation*/
		
		if (contentPoints > 30) {
			System.out.println("Error. Maximum amount of points earned in Grammar is 30.");
			System.exit(0);
		}
		
		else {
			this.contentPoints = contentPoints;
		}
	}
	
	
	/*==Getter and Setter Grammar Points==*/
	
	public int getGrammarPoints() {
		return gramPoints;
	}
	
	public void setGrammarPoints(int gramPoints) {
		if (gramPoints > 30) {
			System.out.println("Error. Maximum amount of points earned in Grammar is 30.");
			System.exit(0);
		}
		
		else {
			this.gramPoints = gramPoints;
		}
	}
	
	/*===Getter and Setter Spelling Points===*/
	
	public int getSpellingPoints() {
		return spellPoints;
	}
	
	public void setSpellingPoints(int spellPoints) {
		
		if (spellPoints > 20) {
			System.out.println("Error. Maximum amount of points earned in Spelling is 20.");
			System.exit(0);
		}
		
		else {
			this.spellPoints = spellPoints;
		}
		
	}
	
	/*===Getter and Setter Content Length Points===*/
	
	public int getContentLengthPoints() {
		return contentLengthPoints;
	}
	
	public void setContentLengthPoints(int contentLengthPoints) {
		
		if (contentLengthPoints > 20) {
			System.out.println("Error. Maximum amount of points earned through content length is 20.");
			System.exit(0);
		}
		
		else {
			this.contentLengthPoints = contentLengthPoints;
		}
		
	}
	
	/*===Getter and Setter Content Points===*/
	
	public int getContentPoints() {
		return contentPoints;
	}
	
	public void setContentPoints (int contentPoints) {
		
		if (contentPoints > 30) {
			System.out.println("Error. Maximum amount of points earned in Grammar is 30.");
			System.exit(0);
		}
		
		else {
			this.contentPoints = contentPoints;
		}
		
	}
}
