package examPrograms;

public class Intervi {
	public static void main(String[] args) {
		String s="aaaarrrttaa";
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
			if(count>1) {
				System.out.print(ch[i]+ " "+count);
			}
		}
	}

}
