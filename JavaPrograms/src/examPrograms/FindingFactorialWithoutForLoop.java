package examPrograms;

public class FindingFactorialWithoutForLoop {
	int fact=1;
	int counter=1;
	public int factorial(int num) {
		if(counter<=num) {
			fact=fact*counter;
			counter++;
			factorial(num);
		}
		
		return fact;
	}
	public static void main(String[] args) {
		int factorial=new FindingFactorialWithoutForLoop().factorial(4);
        System.out.println(factorial);
}
}
