package interviewQuestions;

import java.util.LinkedHashSet;

public class CountDuplicates {
	public static void main(String[] args) {
		String s="we are happy and we will be happy";
		String []str = s.split(" ");
		//LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
		for(int i=0;i<str.length;i++) {
			int count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]&&i>j) {
					break;
				}
				else if(str[i]==str[j]) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(str[i]+ " comes"+count);
			}
		}
	}

}
