package stringPrograms;

public class Palindrome2 {

	public static void main(String[] args) {
	String s= "man is not mam";
	String[] word = s.split(" ");
	Palindrome2 p = new Palindrome2();
	for (String words:word)
//	for(int i=0;i<word.length;i++)
	{
		if(Ispalindrome(words))
		//	if(Ispalindrome(word[i]))
		{
			System.out.println(words+ " is Palindrome");
		}
		else
		{
			System.out.println(words+ "is Not palindrome");
		}
	}
	
	}
	
	public static boolean Ispalindrome(String s) {
		int i1 = 0;
		int i2 = s.length()-1;
		//boolean status=false;
		while(i1<=0) {
			if(s.charAt(i1)!=s.charAt(i2)) {
				//status=true;
				return false;
						
			}
			i1++;
			i2--;
		}
		return true;
		
	}

}
