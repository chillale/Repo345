package stringPrograms;

public class ContainsOO {
	public static void main(String[] args) {
		String s="hello who are you";
	               String[] str = s.split(" ");
		for(int i=0;i<str.length;i++) {
			//String str1=str[i];
			//boolean containsO = str1.contains("o");
			//if(containsO==true)
			if(str[i].contains("o")) {
				System.out.println(str[i]);
			}
//			if(str1.contains("0")) {
//				System.out.println(str1);
//			}
		}
	}

}
