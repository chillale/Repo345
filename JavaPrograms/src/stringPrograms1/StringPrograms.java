package stringPrograms1;

public class StringPrograms {
	public static void main(String[] args) {
		String s ="tester";
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
			if(ch[i]==ch[j]&&i>j) {
				break;
				
			}
			if(ch[i]==ch[j]) {
				count++;
			}
		}
			if(count>0) {
			System.out.println(ch[i]+" "+count);
			}
		}
	}

}
