package examPrograms;

import java.util.Arrays;

public class Program1 {
	public static String m1(String input) {
	StringBuilder output= new StringBuilder();
	char ch[]=input.toCharArray();
	for(char ch1:ch) {
		if(Character.isWhitespace(ch1)) {
			output.append(ch1);
		}
	}
	return output.toString();
}
	public static void main(String[] args) {
		
		String value = m1("vamsi is a good boy");
		System.out.println(value);
	}
}