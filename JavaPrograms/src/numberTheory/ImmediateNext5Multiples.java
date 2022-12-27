package numberTheory;

import java.util.Scanner;

public class ImmediateNext5Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=n+1;i<=n+5;i++) {
			System.out.println(n*i);
			
		}
		
	}

}
