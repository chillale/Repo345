package stringPrograms;

public class StringOccurence {
public static void main(String[] args) {
	String s="aaaabbbcccdddda";
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				i++;
			}
			else {
				break;
			}
		}
		System.out.print(ch[i]+ " "+count);
	}
}

}
