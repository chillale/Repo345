 package interviewQuestions;


public class StringReverseWithRecursive {
	static int counter=0;
	static String s1="";
	public static String recursive(String s) {
		
		if(counter<s.length()) {
			s1=s.charAt(counter)+s1;
			counter++;
			recursive(s);
		}
		return s1;
	}
	public static void main(String[] args) {
		System.out.println(recursive("vaishali"));
	}

}
