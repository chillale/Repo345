package pavanSir;

public class Tricky {
	public static void main(String[] args) {
		int a[] = {5,4,3,8,4,6,5 };
		Tricky t = new Tricky();
		System.out.println(t.m1(a));
	}
	public int m1(int []num) {
		int x=4;
		int y=6;
		for(int i=0;i<num.length;i++) {
			if(num[i]==x||num[i]==y) {
				return -1;
			}
			else 
			{
				return num.length-1;
			}
		}
		return y;
		
	}
}



