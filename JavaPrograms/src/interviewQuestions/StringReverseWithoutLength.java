package interviewQuestions;

public class StringReverseWithoutLength {
	static int counter=0;
	static String s1="";
	public static String m1(String s) {
		if(s.charAt(counter)!=-1) {
			s1=s.charAt(counter)+s1;
			counter++;
			m1(s);
		}
		return s1;
	}
	public static void main(String[] args) {
		System.out.println(m1("sattish"));
	}

}
