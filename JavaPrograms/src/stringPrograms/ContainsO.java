package stringPrograms;

public class ContainsO {
	public static void main(String[] args) {
		
	
	String s="hello who are you where are you going and what are you going to do and";
	String[] str = s.split(" ");
	for(int i=0;i<str.length;i++) {
		char[] ch = str[i].toCharArray();
		for(int j=0;j<ch.length;j++) {
			if(ch[j]=='o') {
				System.out.println(str[i]);
				break;
			}
		}
	}

}
}
