package patternPrograms;

public class Pattern8 {
	/*
	 * 54321
	 * abcd
	 * 543
	 * ab
	 * 5
	 */
	public static void main(String[] args) {
		int n=5;
		char ch='a';
		for(int i=1;i<=5;i++) {
			for(int j=n;j>=i;j--) {
				if(i%2==1) {
					System.out.print(j);
				}else {
					System.out.print(ch++);
				}
			}
			System.out.println();
			ch='a';
		}
	}

}
