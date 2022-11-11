package stringPrograms;

public class LargestCountInnString {
	public static void main(String[] args) {
		String s = "I am an Automation test Engineer";
		String str[]=s.split(" ");
		System.out.println(str.length);
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+ " "+str[i].length());
		}
		int maxCount=0;
		String word = "";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>maxCount) {
				maxCount = str[i].length();
				word = str[i];
			}
		}
		System.out.println(word+ " "+ maxCount);
	}

}
