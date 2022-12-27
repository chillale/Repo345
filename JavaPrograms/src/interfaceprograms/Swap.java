package interfaceprograms;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {
		int n=123456;
		
		Integer n1=Integer.valueOf(n);
		String str=n1.toString();
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i=i+2) {
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		System.out.println(Arrays.toString(ch));
	}

}
