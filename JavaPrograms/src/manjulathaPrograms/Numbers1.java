package manjulathaPrograms;

import java.util.Scanner;

public class Numbers1 {
	public static boolean m1(int a, int b ,int c) {
		if((a*a)+(b*b)==c) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(m1(n1,n2,n3)) {
			System.out.println("The squares of first two digits is equal to third numbers");
		}
		else {
			System.out.println("The squares of first two digits is not equal to third numbers");
		}
	}

}
