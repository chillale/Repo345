package examPrograms;

import java.util.Scanner;

public class ProgramUsingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the numbers");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int temp=num,sum=0;
			while(num>0) {
				int digit=num%10;
				sum=sum*10+digit;
				num=num/10;
			}
			if(temp==sum) {
				System.out.println(temp+" is palindrome");
			}
			else {
				System.out.println(temp+" is not palindrome");
			}
		}
	}

}
