package interviewQuestions;

public class PerfectNumber {
	public static void main(String[] args) {
		for(int j=10;j<=1000;j++) {
			int sum=0;
		for(int i=1;i<=j/2;i++) {
			if(j%i==0) {
				sum+=i;
			}
		}
		if(sum==j) {
			System.out.println("The number is perfect number"+j);
		}
		
		}
	}

}
