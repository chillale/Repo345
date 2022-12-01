package stringPrograms;

public class SubStringMethods {
	public static void main(String[] args) {
		String s="welcome to india";
		String[] str=s.split(" ");
		String allLetters="";
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			String upper=word.substring(0, 1).toUpperCase();
			String remLetters=word.substring(1);
			allLetters=allLetters+upper+remLetters+" ";
			
		}
		System.out.println(allLetters);
	}

}
