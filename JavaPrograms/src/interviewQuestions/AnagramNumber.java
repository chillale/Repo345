package interviewQuestions;

import java.util.Arrays;

public class AnagramNumber {
	public static void main(String[] args) {
		int num=123;
		int num1=3176;
		String str = Integer.toString(num1);
		String str1=Integer.toString(num);
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch);
		String str2=ch.toString();
		String str3=ch1.toString();
	}

}
