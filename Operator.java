package MyProject;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=20, math=35, sci=65, score=45;
				//&& AND || OR
		 if ((math>=35)&&(sci>=35)){
			 System.out.println("The student is pass");
		 }
		 else
		 {
			 System.out.println("The student is fail");
		 }
		 switch(score) {
		 case 90:
			 System.out.println("Very good");
		 
		 case 60:
			 System.out.println("good");
			 
		 case 30:
			 System.out.println("okay");
	     default:
	    	 System.out.println("dont know");
		 }
		System.out.println(age<50 ? "You are young" : "You are old");
	}

}
