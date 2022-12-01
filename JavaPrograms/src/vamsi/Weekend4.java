package vamsi;

import java.util.Scanner;

public class Weekend4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the day");
	String s=sc.next();
	switch(s) {
	
	case "Monday":System.out.println(s+" is not weekend");
	case "Tuesday":System.out.println(s+"is not weekend");
	case "Wednesday":System.out.println(s+"is not weekend");
	case "Thursday":System.out.println(s+"is not weekend");
	case "Friday":System.out.println(s+"is not weekend");
	break;
	case "Saturday":System.out.println(s+" is weekend");
	case "Sunday" : System.out.println(s+" is weekend");
	break;
	default : System.out.println(s+" is not a day");
	break;
	
	}
}

}
