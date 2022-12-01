package vamsi;

import java.util.Scanner;

public class Weekend2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		String s=sc.next();
		if(s.equals("Saturday")||s.equals("Sunday")) {
			System.out.println(s+"is weekend day");
		}
		else {
			System.out.println(s+" is working day");
		}
	}

}
