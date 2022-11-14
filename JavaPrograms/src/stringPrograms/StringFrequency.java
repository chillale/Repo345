package stringPrograms;

public class StringFrequency {
	public static void main(String[] args) {
		String s= "aabbccddaaa";
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&i>j) {
					count++;
					
				}
			}
			
		}
		System.out.println(s+ " "+count);
		
	}

}
