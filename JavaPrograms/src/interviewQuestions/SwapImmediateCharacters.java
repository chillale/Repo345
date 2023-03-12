package interviewQuestions;

import java.util.Arrays;

public class SwapImmediateCharacters {
	public static void main(String[] args) {
		String s = "a*#b*%d*%c*&";
		char ch[] = s.toCharArray();
		int b=0;
		for (int i=0;i<ch.length;i++) {
			if(i<ch.length/2-1) {
				b=ch.length/2-1;
			}
			if(i==ch.length/2) {
				b=ch.length-1;
			}
			for(int j=b;j>=0;j--) {
				if(i<j&&ch[i]>='a'&&ch[i]<='z'&&ch[j]>='a'&&ch[j]<='z') {
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(ch));
	}
}
