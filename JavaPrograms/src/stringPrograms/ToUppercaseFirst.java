 package stringPrograms;

public class ToUppercaseFirst {
	public static void main(String[] args) {
		String s="WELCOME TO HYDERABAD";
		String[] str = s.split(" ");
//		for(String w:str) {
//			String all = w.substring(0, 1).toUpperCase().substring(1);
//			System.out.println(all);
//		}
	    String allLetters="";
	    for (String w : str) {
		String upperCase = w.substring(0, 1).toLowerCase();
			String remainingLetters = w.substring(1);
			allLetters = allLetters+upperCase+remainingLetters+" ";
			
		}
	    System.out.println(allLetters);
		
	}

}
