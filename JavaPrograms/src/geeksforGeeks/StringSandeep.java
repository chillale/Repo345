package geeksforGeeks;

import java.util.Arrays;

public class StringSandeep {
	public static void main(String[] args) {
		String s="a#&b#@c*^d";
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(start<end) {
			if(ch[start]>='a'&&ch[start]<='z'&&ch[end]>='a'&&ch[end]<='z') {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				
			}
			start++;
			end--;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
