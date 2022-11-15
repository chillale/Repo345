package stringPrograms;

public class LargestCountInnString {
	public static void main(String[] args) {
		String s = "I am an Automation test Engineer";
		String str[]=s.split(" ");
		System.out.println(str.length);
		System.out.println("here we are printing how much the word length is having");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+ " "+str[i].length()+" ");
		}
		System.out.println();
		int maxCount=0;
		String word = "";
		System.out.println("here we are printing the highest word length count	");
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>maxCount) {
				maxCount = str[i].length();
				word = str[i];
			}
		}
		System.out.println(word+ " "+ maxCount);
	}

}
