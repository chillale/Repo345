package geeksforGeeks;

import java.util.Scanner;

public class PerfectScanerUsingMethod {
	public static boolean perfect(int num) {
		int sum=0;
		int copy=num;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(copy==sum) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int range = sc.nextInt();
        int a[]=new int[range];
        for(int i=0;i<range;i++) {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<range;i++) {
        	if(perfect(a[i])) {
        		System.out.println(a[i]+ " is perfect number");
        	}else {
        		System.out.println(a[i]+ " is not perfect number");
        	}
        }
	}

}
