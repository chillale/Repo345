package stringPrograms1;

public class SringSentence4 {
	public static void main(String[] args) {
		String s = "welcome to tyss welcome to india";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+ " "+(i+1));
		}
	}

}
