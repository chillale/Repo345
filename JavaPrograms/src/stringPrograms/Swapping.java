package stringPrograms;

public class Swapping {
	public static void main(String[] args) {
		String s="hyderabad";
		String s1="banglaore";
		s=s+s1;
		s1=s.substring(0, s.length()-s1.length());
		s=s.substring(s1.length());
		System.out.println(s+"\n"+s1);//\n is printing in a new line
	}

}
