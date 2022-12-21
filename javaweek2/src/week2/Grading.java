package week2;

public class Grading {

	public static void main(String[] args) {
		// Given a numeric grade from 0-100, assign a letter grade.
		new Grading().run();

	}

	private void run() {
		int score = 99;
		String grade;
		
		grade = gradeByIf(score);
		System.out.println(
				"Given a score of " + score + " - you got a grade of " + grade);
	   
		grade = gradeByAdvancement (score);
		System.out.println(
				"Given a score of " + score + " - you got a grade of " + grade);	
	
		grade = gradeBySwitch(score); 
		System.out.println(
				"Given a score of " + score + " - you got a grade of " + grade);	
	}

	 private String gradeBySwitch (int score) {
	 String grade;
	switch (score / 10) {
	 case 10:
	 case 9:
		 grade = "A";
		 break;
		 
	 case 8:
		 grade = "B";
		 break ; 
	 
	 case 7:
		 grade = "C";
		 break ; 
	 
	 case 6:
		 grade = "D";    
		 break ;
		 
		 default:
			 grade = "F"; 
			 break; 
	 	}
	return grade; 
	 }
	private String gradeByAdvancement(int score) {
		String grades = "FFFFFFDCBA";
		int counter = 0;
		
	while(counter * 10 < score)  {
		counter++; 
		// counter +=1;
		// ++counter;
	}
	if(score % 10 != 0) {
	   counter -= 1;
	
	}
	
	char cgrade = grades.charAt(counter);
	String grade = Character.toString(cgrade);
	
	return grade;
	
}

	private String gradeByIf(int score) {
		String grade;
		
		if(score >= 90) {
		grade = "A";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else if(score >= 70)  { 
			grade = "C";
		}
		else if(score >= 60)  {
			grade = "D"; 
		}
		else  {
			grade = "F";
		}
		
		return grade;
	}
}
