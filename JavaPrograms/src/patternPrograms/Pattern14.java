package patternPrograms;

public class Pattern14 {
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
