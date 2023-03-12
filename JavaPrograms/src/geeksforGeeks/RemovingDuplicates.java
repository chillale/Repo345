package geeksforGeeks;

public class RemovingDuplicates {
	public static void main(String[] args) {
		String str="abcdxyzabcd";
		String str1="";
		for(int i=0;i<str.length();i++) {
			try {
			if((str1.charAt(i))==-1) {
				str1=str1+str.charAt(i);
			}
			}
			catch(Exception e) {
				e.printStackTrace();
		}
		}
		System.out.println(str1);
	}

}
