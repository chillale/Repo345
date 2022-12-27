package interviewQuestions;

public class FactorialWithoutForLoop {
	public static void main(String[] args) {
	
		int counter=5;
		int fact=1;
		while(counter>0) {
			fact=fact*counter;
			counter--;
		}
		System.out.println(fact);
		
	}

}
