package examPrograms;

public class StringWithSpaces {
	public static void main(String[] args) {
		String s="Cloudtech@#$12  ";
		char[] ch=s.toCharArray();
		int count=0;
		String specialCharacters="";
		for(int i=0;i<ch.length;i++) {
			if(!Character.isWhitespace(ch[i])&&!Character.isLetter(ch[i])&&!Character.isDigit(ch[i])) {
				count++;
				specialCharacters=specialCharacters+ch[i];
			}
		}
		System.out.println(specialCharacters+" "+count);
	}

}
