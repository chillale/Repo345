package stringPrograms;

public class Palindrome {
	public static void main(String[] args) {

		String s = "malayalam";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i)+rev;
		}
		if (rev.equals(s)) {
			System.out.println(s + " is a palindrome String");
		} else {
			System.out.println(s + " is not a palindrome String");
		}
		System.out.println(s.substring(1, 4));
		//System.out.println(s.substring));
		System.out.println(s.substring(4, 7));
		System.out.println(s.substring(6, s.length()));
	}
}