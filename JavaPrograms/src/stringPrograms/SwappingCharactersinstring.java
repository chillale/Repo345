package stringPrograms;

import java.util.Arrays;

public class SwappingCharactersinstring {
	public static void main(String[] args) {
		String s = "a&*b=@c&^d";
		int start = 0;
		int end = s.length() - 1;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[start] >= 'a' && ch[end] <= 'z') {
				if (ch[end] >='a' && ch[end] <= 'z') {
					if (start < end) {

						char temp = ch[start];
						ch[start] = ch[end];
						ch[end] = temp;
						start++;
						end--;
					}
				}
				end--;
			} else {
				start++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
