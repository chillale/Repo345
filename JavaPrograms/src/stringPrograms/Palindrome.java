package stringPrograms;

public class Palindrome {
	public static void main(String[] args) {

		String s = "madam ";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(s)) {
			System.out.println(s + " is a palindrome String");
		} else {
			System.out.println(s + " is not a palindrome String");
		}
	}
}