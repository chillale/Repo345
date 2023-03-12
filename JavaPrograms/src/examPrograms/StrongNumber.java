package examPrograms;

public class StrongNumber {
	
    public static void main(String[] args) {
		String s="abcde ddd";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
