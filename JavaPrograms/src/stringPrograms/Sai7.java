package stringPrograms;

public class Sai7 {
	public static void main(String[] args) {
		String s="welcome to hyderabad";
		String[] str = s.split(" ");
		String s2="";
		for(String s3:str) {
			String upper=s3.substring(0, 1).toUpperCase();
			String remLetters=s3.substring(1);
			s2=s2+upper+remLetters+" ";
		}
		System.out.println(s2);
	}

}