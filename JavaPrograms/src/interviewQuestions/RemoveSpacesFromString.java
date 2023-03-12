package interviewQuestions;

public class RemoveSpacesFromString {
	public static void main(String[] args) {
		String s="my name is sravan";
		char ch[]=s.toCharArray();
		String s1="";
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
	}

}
