package geeksforGeeks;

import java.util.Scanner;

public class PerfectScanner {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int range = sc.nextInt();
		int a[]=new int[range];
		for(int i=0;i<range;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<range;i++) {
		   	int num=a[i];
		   	int sum=0;
		   	for(int j=1;j<=a[i]/2;j++) {
		   		if(a[i]%j==0) {
		   			sum+=j;
		   		}
		   	}
		   	if(sum==num) {
		   		System.out.println(num+" is perfect number");
		   	}else {
		   		System.out.println(num+ " is not perfect number");
		   	}
		}
	}
}
