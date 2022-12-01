package arrayPrograms;

public class TwoMaximumNumbersWithDuplicates {
	public static void main(String[] args) {
		int a[]= {99,33,12,99,15};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]>=fmax) {
					if(a[i]!=fmax) {
					smax=fmax;
					
					}
					fmax=a[i];
				}
				else if(smax<a[i] || fmax==smax){
					smax=a[i];
				}
		}
       System.out.println("Two maximum with Duplicates"+fmax+" "+smax);
	}

}
