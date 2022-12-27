package geeksforGeeks;

public class Geek1 {
	public static void main(String[] args) {
		String s="testyantra";
		int aCount=0;
		int eCount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='e') {
				eCount++;
			}
			if(s.charAt(i)=='a') {
				aCount++;
			}
		}
		System.out.println("A count is "+aCount+ "\nE count is "+eCount);
		
	}

}
