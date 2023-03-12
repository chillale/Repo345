package interviewQuestions;

public class SumOfNumbes {
	public static void main(String[] args) {
		int num=123;
		int rem=num%10;
		int num1=num/10;
		int sum=0;
		while(num1>0) {
			sum=sum+num1%10;
			num1/=10;
		}
		if(rem==sum) {
			System.out.println("the third digit is equal to sum of first two digits");
		}
		else {
			System.out.println("the third digit is not equal to sum of first two digits");
		}
	}

}
