package patternPrograms;

public class DiamondNumber {
	/*
	 *      555555555
	 *       4444444
	 *        33333
	 *         222
	 *          1
	 *         
	 */
	public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
		    for(int j=1;j<=i;j++) {
		    	System.out.print(i);
		    }
		    for(int j=i-1;j>=1;j--) {
		    	System.out.print(i);
		    }
		    System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
		    for(int j=1;j<=i;j++) {
		    	System.out.print(i);
		    }
		    for(int j=i-1;j>=1;j--) {
		    	System.out.print(i);
		    }
		    System.out.println();
		}
	}

}
