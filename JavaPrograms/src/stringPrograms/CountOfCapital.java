package stringPrograms;

public class CountOfCapital {
	public static void main(String[] args) {
		String s="Im iN HyDEraBAD";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String s2=s1[i];
			int count=0;
			for(int j=0;j<s2.length();j++) {
				if(s2.charAt(j)<='Z') {
					count++;
				}
			}
			System.out.println(s2+ " "+count);
		}
	}

}
