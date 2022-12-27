package pavanSir;

import java.util.Arrays;


public class SwappingCharacters  {
      public static void main(String[] args) {
    	  
		String s = "z%#d*%b#a";
		//output a%#b*%d#z
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='z') {
				char ch1=ch[i];
				ch[i]=ch[ch.length-1];
				ch[ch.length-1]=ch1;
						}
			if(ch[i]=='d') {
				char ch2=ch[i];
				ch[i]=ch[ch.length-3];
				ch[ch.length-3]=ch2;
			}
		}
		System.out.println(Arrays.toString(ch));
	
      }

}
