package stringPrograms1;

public class StrongNumber {
	public static void main(String[] args) {
		int num=145,temp=num,sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+"is Strong Number");
		}
		else {
			System.out.println(temp+"is not a strong Number");
		}
	}
	public static int factorial(int rem) {
		int fact=1;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
