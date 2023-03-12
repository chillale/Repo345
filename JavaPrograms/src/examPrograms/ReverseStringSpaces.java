package examPrograms;

public class ReverseStringSpaces {
	public static void main(String[] args) {
		String s = "java language java automation";
		String s1[] = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			String rev = "";
			String s2 = s1[i];
			if (i % 2 == 1) {
				for (int j = 0; j < s2.length(); j++) {
					rev =  s2.charAt(j)+rev ;
				}
			}else {
				System.out.print(s2+" ");
			}
			System.out.print(rev+" ");
		}
	}

}
