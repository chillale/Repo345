package stringPrograms;

import java.util.Arrays;

public class CharacterReverse {
	public static void main(String[] args) {
		String s="z*d%#b%#a";
		int start=0;
		int end=s.length()-1;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(start<end) {
				char ch1=ch[start];
				ch[start]=ch[end];
				ch[end]=ch1;
				start++;
				end--;
			}
		}
		System.out.println(Arrays.toString(ch));
		int a=20;
		int b=30;
		a++;
		b--;
		++a;
		--b;
		System.out.println((++a)+(--b));
		
		
		
	}

}
