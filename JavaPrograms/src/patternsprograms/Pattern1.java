package patternsprograms;

public class Pattern1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int num = 5;
			int space = 4;
			for (int k = 1; k <= i; k++) {
				System.out.print(num--);
			}
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
          System.out.println();
		}
	}

}
