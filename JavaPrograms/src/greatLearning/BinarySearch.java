package greatLearning;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {1,3,5,6,88};
		int key=88;
		int first=0;
		int last=a.length;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]<key) {
				first=mid+1;
			}
			else if(a[mid]== key) {
				System.out.println("Element found at location"+mid);
				break;
			}
			else{
				 last=mid-1;
			}
		}
		if(first>last) {
			System.out.println("Element Not found");
		}
	}

}
