package examPrograms;
public class SoumyaSirQuestion {
	public static void main(String[] args) {
		String s="aaaabbbccaaccddvvddfuuuoo";
		String s1="aabbc";
		String s2="aabbccd";
		char[] ch=s1.toCharArray();
		int characterCount=0;
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
			if(count>1) {
				characterCount++;
			}
		}
		System.out.println(characterCount);
//		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet();
//		for(int i=0;i<ch.length;i++) {
//			linkedHashSet.add(ch[i]);
//			
//		}
//		int characterCount=0;
//		for(Character singlecharacter:linkedHashSet)
//		{
//			int count=0;
//			
//			for(int i=0,j=i+1;i<ch.length;i++,j++) {
//				if(singlecharacter==ch[i]&&singlecharacter==ch[j]) {
//					count++;
//					i++;
//					break;
//				}
//			}
//			if(count==1) {
//				characterCount++;
//			}
//		}
//		System.out.println(characterCount);
		
	}

}
