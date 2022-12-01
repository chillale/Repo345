package vamsi;

import java.util.Scanner;

public class Weekend5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		String s = sc.next();
		switch (s) {
		case "Monday" : {
			System.out.println(s+"is not a day");
			break;
		}
		default :{
			System.out.println(s+ " is a weekend");
			break;
		}
		}
	}

}
