 package stringPrograms;

public class StringRev {
	public static void main(String[] args) {
		String s = "DJTILLU IS A HERO";
		 String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			String rev = "";
			String s1 = str[i];
			for (int j = 0; j < s1.length(); j++) {
				rev = s1.charAt(j) + rev;
			}
			System.out.print(rev + " ");
		}
	}

}
