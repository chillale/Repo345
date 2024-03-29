package patternPrograms;

public class Pattern7 {
	/*
	 *      1
	 *     222
	 *    33333
	 *   4444444
	 *    33333
	 *     222
	 *      1   
	 */
	public static void main(String[] args) {
		int n=4;
		
		//1st Half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//Second half
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
