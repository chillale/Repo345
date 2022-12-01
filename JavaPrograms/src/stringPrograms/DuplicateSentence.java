package stringPrograms;

public class DuplicateSentence {
	public static void main(String[] args) {
		String s="i am working as a engineer and i working am working in testyantra";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(str[i].equals(str[j])&&i>j) {
					break;
				}
				if(str[i].equals(str[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(str[i]);
			}
		}
	}

}
