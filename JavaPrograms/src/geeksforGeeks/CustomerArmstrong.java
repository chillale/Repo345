package geeksforGeeks;

import java.util.Scanner;

public class CustomerArmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The range of array");
		int range = sc.nextInt();
		int a[]=new int[range];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int copy=num;
			int count=0;
			int power=1,digit,sum=0;
			while(num>0) {
				 digit=num%10;
				count++;
				num/=10;
			}
			num=copy;
			while(num>0) {
				power=1;
				digit=num%10;
				for(int j=1;j<=count;j++) {
					power=power*digit;
				}
				sum=sum+power;
				num/=10;
			}
			if(copy==sum) {
				System.out.println(a[i]+ " is armstrong number");
			}
			else {
				System.out.println(" is not armstrong number"+ a[i]);
			}
		}
	}

}
