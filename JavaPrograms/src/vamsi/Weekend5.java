package vamsi;

import java.util.Scanner;

public class Weekend5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int a=10;
		int b=20;
		String s=sc.next();
		switch (s) {
		case "Add" : {
			System.out.println(a+b);
			break;
		
		}
		case "mul" :{
			System.out.println(a-b);
			break;
		}
		default :{
			System.out.println(s+ " is a weekend");
			break;
		}
		}
	}

}
