package stringPrograms;

public class StringOccurence1 {
	public static void main(String[] args) {
		String s="mannu";
		char[] ch=s.toCharArray();
		for(char c='a';c<='z';c++) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]==c) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(c+" "+count);
			}
		}
		}
	}


