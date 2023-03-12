package patternPrograms;

public class Pattern9 {
	public static void main(String[] args) {
		int n=5;
		//first half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//second half
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
