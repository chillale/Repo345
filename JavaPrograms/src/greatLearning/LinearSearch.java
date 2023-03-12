package greatLearning;

public class LinearSearch {
	public static int linear(int a[],int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]= {2,34,22,354,6564,6753,456};
		int key=354;
		System.out.println(linear(a,key));
	}

}
