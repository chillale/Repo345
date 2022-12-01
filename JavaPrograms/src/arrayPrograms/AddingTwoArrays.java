package arrayPrograms;

public class AddingTwoArrays {
	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]= {1,3,4,5,7};
		int len=a.length;
		if(a.length<b.length) {
			len=b.length;
		}
		for(int i=0;i<len;i++) {
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
		}
	}

}
