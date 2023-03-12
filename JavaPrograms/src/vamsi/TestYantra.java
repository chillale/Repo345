package vamsi;

import java.util.Arrays;

public class TestYantra {
	public static void main(String[] args) {
		String s ="I am Harish";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			String rev="";
			for(int j=0;j<s1.length();j++) {
				rev=s1.charAt(j)+rev;
			}
			System.out.print(rev+ " ");
		}
			
		}

	
	}


