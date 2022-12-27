package interviewQuestions;

public class StringWithoutLength {
	public static void main(String[] args) {
		String s="sateesh";
		int count=0;
		String s1="";
		try
		{
		while(s.charAt(count)!=-1) {
			s1=s.charAt(count)+s1;
			count++;
		}
		}catch(Exception e) {
			System.out.println();
		}
		System.out.println(s1);
	}

}
