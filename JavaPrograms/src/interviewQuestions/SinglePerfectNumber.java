package interviewQuestions;

public class SinglePerfectNumber {
	public static void main(String[] args) {
		int n=28;
		int copy=n;
		int sum=0;
		int i=1;
		while(i<=copy/2) {
			if(n%i==0) {
				sum=sum+i;
				i++;
			}
		}
		if(sum==copy) {
			System.out.println("The perfect Number"+sum);
		}
		else {
			System.out.println("the non perfect Number is"+sum);
		}
	}

}
