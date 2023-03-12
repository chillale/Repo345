package interviewQuestions;

import java.util.Arrays;

public class SwappingCharacters {
	public static void main(String[] args) {
		int num=123456;
		char[] ch = Integer.toString(num).toCharArray();
		for(int i=0;i<ch.length;i=i+2) {
			for(int j=i+1;j<ch.length;j++) {
				try {
			if(ch[i]+ch[j]!=103) {//Used for ascii
				char temp=ch[i+1];
				ch[i+1]=ch[j+1];
				ch[j+1]=temp;
			}else { 
				break;
			}
				}catch(Exception e) {
					
				}
			
		}
		}
		System.out.println(Arrays.toString(ch));
	}

}
