package examPrograms;

import java.util.Scanner;

public class ArmstrongUsingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int digit,temp=num,sum=0,count=0,power=1;
			while(num>0) {
				 digit=num%10;
				count++;
			    num=num/10;	
			}
			num=temp;
			while(num>0) {
				power=1;
				 digit=num%10;
				for(int j=1;j<=count;j++) {
					power=power*digit;
				}
				sum=sum+power;
				num=num/10;
			}
			
			if(temp==sum) {
				System.out.println(temp+" is armstrong");
			}
			else {
				System.out.println(temp+ " is not armstrong");
			}
			
		}
	}

}
