package patternsprograms;

public class Pattern3 {
	public static void main(String[] args) {
		int space = 0, star = 5;
		for (int i = 1; i <= 5; i++) {
			int num = 1;
			for (int j = 1; j <= star; j++) {System.out.print(num++);}
			for(int k=1;k<=space;k++) {System.out.print(" ");}
			space++;
			star--;
			System.out.println();
		}
	}

}
