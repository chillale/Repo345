package examPrograms;

public class StringReverseUsingSplit 
{
	public static void main(String[] args) {
		String s="My name is rahul";
		String []s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String str=s1[i];
			String str1="";
			for(int j=str.length()-1;j>=0;j--) {
				str1=str.charAt(j)+str1;
			}
			System.out.print(str1+ " ");
		}
	}

}
