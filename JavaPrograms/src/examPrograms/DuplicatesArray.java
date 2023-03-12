package examPrograms;

import java.util.HashMap;

public class DuplicatesArray {
	public static void main(String[] args) {
		int a[]= {7,2,6,1,4,7,4,5,4,7,7,3,1};
		HashMap<Integer, Integer> hash = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(hash.containsKey(a[i])) {
				hash.put(a[i], hash.get(a[i])+1);
			}else {
				hash.put(a[i], 1);
			}
		}
		for(Integer key:hash.keySet()) {
			if(hash.get(key)>1) {
			System.out.println(key+" = "+hash.get(key));
			}
		}
	}

}
