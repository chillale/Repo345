package stringPrograms;

public class LargestCountIntheString {
	public static void main(String[] args) {
		String s = "I am an Automation test Engineer";
		String[] str = s.split(" ");
		String str1=str[0];
		for(int i=0;i<str.length;i++) {
			
			if(str1.length()<str[i].length())
			{
				str1=str[i];
			}
			
		}
		System.out.println(str1+" "+str1.length());
		
	}

}
