package interviewQuestions;

public class FactorialWithRecursive {
	int fact=1;
	int counter=1;
	public int recursive(int n) {
		if(counter<=n) {
			fact=fact*counter;
			counter++;
			recursive(n);
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(new FactorialWithRecursive().recursive(6));
	}

}
