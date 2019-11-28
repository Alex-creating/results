package Results;

public class results {
	
	static int physicsScore = 100;
	static int biologyScore = 100;
	static int chemistryScore = 108;
	int total;
	static int percentage;
	
	public static void totalScore(int physScore, int bioScore, int chemScore) {
		System.out.println("You scored:");
		System.out.println("Physics: " + physScore + "/150");
		System.out.println("Biology: " + bioScore + "/150");
		System.out.println("Chemistry: " + chemScore + "/150");
		
		int total = physScore + bioScore + chemScore;
		System.out.println("Your total score is " + total + "/450");
	}
	
	public static void percentageScore(int physScore, int bioScore, int chemScore) {
		int total = physScore + bioScore + chemScore;
		int percentage = ((total*100)/450);
		System.out.println("Your overall percentage is: " + percentage + "%");
		
		int physPercentage = (physScore*100)/150;
		int chemPercentage = (chemScore*100)/150;
		int bioPercentage = (bioScore*100)/150;
		

		
		int failedExams = 0;  
		
		if (physPercentage<60) {
			failedExams++;}
		if (chemPercentage<60) {
				failedExams++;}
		if (bioPercentage<60) {
					failedExams++;}
		System.out.println("You have failed " + failedExams + " exam(s)!");	
	if (failedExams == 0) {
		System.out.println("You have passed it all!");}
	
				
	}
	
	
	

	public static void main(String[] args) {
    totalScore(physicsScore, biologyScore, chemistryScore);
    percentageScore(physicsScore, biologyScore, chemistryScore);
    
   
    
	}

}
