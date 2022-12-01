package arrayPrograms;

public class MinimumElement {
	public static void main(String[] args) {
		int a[]= {2,33,12,8,99};
		int minElement=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<minElement) {
				minElement=a[i];
			}
		}
		System.out.println(minElement);
	}

}
