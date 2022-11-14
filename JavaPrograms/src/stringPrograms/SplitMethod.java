package stringPrograms;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String s = "sk showkath ali";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) 
		{
			String str1=str[i];
		    String rev=" ";
		    for(int x=0;x<str1.length();x++)
		    {
				rev=str1.charAt(x)+rev;
				
		    }
		    System.out.println(rev);
		}
		
	}

}
