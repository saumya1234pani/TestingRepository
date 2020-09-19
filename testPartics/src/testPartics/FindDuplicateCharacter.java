package testPartics;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateCharacter {

	public static void main(String[] args) {

		int val[] = {2,1,2,3,1,6,4,7,5,4,6,8,7,1,2};
		int valu = 0;
		List li = new ArrayList<>();//[2,1]
		boolean bval = true;
		
		
		int value = 0;
		for(int i=0;i<val.length;i++) {
			if(!(li.equals(null))) {
				
				for (int k=0;k<li.size();k++) {
					if(li.get(k).equals(val[i])) {
						bval =false;
						}
					}
				
			}
			value =0;
			for(int j=i+1;j<val.length;j++) {
				
				if(val[i]==val[j] && bval) {
					
					li.add(val[i]);
					break;
				}
				
			}bval = true;
		}
		System.out.print(li);
	}

}
