package stringPrograms;

public class StringSequence {
	public static void main(String[] args) {
		String s="aaaabbbccaa"; //4
		String s1="aabbc"; //2
		String s2="aaabaaccbb"; //4
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					i++;
				}
				else {
					break;
				}
			}
			if(count>1) {
				System.out.println(ch[i]+" "+count);
			}
		}
		
	}

}
