package stringPrograms;

public class MinimumCount {
	public static void main(String[] args) {
		String s="I am an Automation Engineer";
		String[] str=s.split(" ");
		String str1="";
		int maxCount=0;
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>maxCount) {
				maxCount = str[i].length();
				str1 = str[i];
			}
			
			
		}
		System.out.println(str1+ " "+maxCount);
		
	}

}
