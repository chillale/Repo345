package arrayPrograms;

public class Palindrome {
	public static void main(String[] args) {
		int num=121,temp=num,sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is palindrome");
		}
		else {
			System.out.println(temp+ " is not palindrome");
		}
	}

}
