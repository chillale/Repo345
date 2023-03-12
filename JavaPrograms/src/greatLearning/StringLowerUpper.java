package greatLearning;

public class StringLowerUpper {
	public static void main(String[] args) {
		String s="PrAdEeP";
		String upp="";
		String low="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				low=low+Character.toLowerCase(ch);
				
			}else {
				upp=upp+Character.toUpperCase(ch);
			}
		}
		String output = upp+low;
		System.out.println(output);
	}

}
