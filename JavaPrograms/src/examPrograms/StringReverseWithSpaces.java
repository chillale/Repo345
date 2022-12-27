package examPrograms;

public class StringReverseWithSpaces {
	public static void main(String[] args) {
		String s="My name is rahul";
		String s1="";
		for(int i=0,j=s.length()-1;i<s.length();i++,j--) {
			//if(s.charAt(i)<='z'||s.charAt(i)<='Z') {
				s1=s1+s.charAt(j);
			//}
		}
		System.out.println(s1);
	}

}
