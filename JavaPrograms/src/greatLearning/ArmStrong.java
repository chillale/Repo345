package greatLearning;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int digit,n1=n,count=0,sum=0,power=1;
		while(n>0) {
			 digit=n%10;
			count++;
			n=n/10;
		}
		n=n1;
		while(n>0) {
			power=1;
		   digit=n%10;	
		  for(int i=1;i<=count;i++) {
			  power=power*digit;
		  }
		  sum=sum+power;
		  n/=10;
		}
		if(sum==n1) {
			System.out.println(n1+"is armstrong");
		}else {
			System.out.println(n1+"is not armstrong");
		}
	}

}
