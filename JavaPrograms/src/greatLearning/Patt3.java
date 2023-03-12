package greatLearning;

public class Patt3 {
	public static void main(String[] args) {
		int num=0,space=4;
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				num++;
				space--;
			}
			else {
				num--;
				space++;
			}
			for(int j=1;j<=num;j++) {
				System.out.print(num);
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
