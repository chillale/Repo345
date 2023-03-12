package interviewQuestions;

public class ReversingFirstHalfSecond {
	public static void main(String[] args) {
		String s="abcdef";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(i<s.length()/2) {
				s1=s.charAt(i)+s1;
			}
			else {
				s2=s.charAt(i)+s2;
			}
		}
		System.out.println(s1+ " and "+s2);
	}

}
