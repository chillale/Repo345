package arrayPrograms;

public class MaximumElement {
	public static void main(String[] args) {
		int a[]= {4,55,76,33,54};
		int maxElement=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>maxElement) {
				maxElement=a[i];
			}
		}
		System.out.println(maxElement);
	}

}
