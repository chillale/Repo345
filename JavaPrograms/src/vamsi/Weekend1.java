package vamsi;

import java.util.Scanner;

public class Weekend1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		String s=sc.next();
		
		switch (s) {
		case "Monday":System.out.println("Monday is working day");
			
			break;
		case "Tuesday":System.out.println("Tuesday is Working day");
		break;
		case "Wednesday":System.out.println("Wednesday is Working day");
		break;
		case "Thursday":System.out.println("Thursday is Working day");
		break;
		case "Friday":System.out.println("Friday is Working day");
		break;
		case "Saturday":System.out.println("Saturday is weekend");
		break;
		case "Sunday": System.out.println("Sunday is weekend");
		break;

		default:System.out.println("it is not a day");
			break;
		}
		
	}

}
