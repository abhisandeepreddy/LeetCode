import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class MinimumComman {
//Done
	public static void main(String args[]) {
		int[] nums1 = new int[] {1,2,3,4};
		int[] nums2 = new int[] {4,5,6,7};
		
		Solution1 s = new Solution1();
		int resut = s.getCommon(nums1, nums2);
		System.out.println(resut);
	}
}

class Solution1 {
    public int getCommon(int[] nums1, int[] nums2) {
        
    	LinkedHashSet<Integer> common = new LinkedHashSet<Integer>();
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	
    	for(int i: nums1) {
    		common.add(i);
    	}
    	
    	for(int j: nums2) {
    		if(common.contains(j)) {
    			return j;
    		}
    	}
    	
    	return 0;
    	
    }
}