 package arrayPrograms;

public class DuplicatesArray {
	public static void main(String[] args) {
		int a[]= {10,20,30,10,30,40};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]&&i>j) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(a[i]+"present "+count+" times");
			}
		}
	}

}
