package geeksforGeeks;

import java.util.Scanner;

public class PalindromeScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int range = sc.nextInt();
		int a[]=new int[range];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int num=a[i];
			int sum=0,digit;
			while(a[i]>0) {
				digit=a[i]%10;
				sum=(sum*10)+digit;
				a[i]/=10;
			}
			if(sum==num) {
				System.out.println(num+ " is palindrome");
			}else {
				System.out.println("is not palindrome"+num);
			}
		}
	}

}
