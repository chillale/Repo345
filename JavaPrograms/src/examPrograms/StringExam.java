package examPrograms;

public class StringExam {
	public static void main(String[] args) {
		String s="My name is rahul";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			
			if(!(s.charAt(i)==' ')) {
				s1=s1+s.charAt(i);
				
			}
			
		}
		System.out.println(s1);
		
	}

}
