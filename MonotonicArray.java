
public class MonotonicArray {
//Done
	public static void main(String args[]) {

		Mono m = new Mono();
		int[] arr = new int[] { 6,5,4,4 };
		System.out.print(m.isMonotonic(arr));
	}
}

class Mono {

	public boolean isMonotonic(int[] nums) {
	
		int len = nums.length;
		
		if(len <= 2)
			return true;

		int number = nums[0];
		for(int i = 1; i < len; i++) {
		
			if(number <= nums[i])
				number = nums[i];
			else
				break;
			
			if(i == len-1)
				return true;
		}
		
		
		number = nums[0];
		for(int j = 1; j < len; j++) {
			
			if(number >= nums[j])
				number = nums[j];
			else
				return false;

			if(j == len-1)
				return true;

		}
		return false;
	}
}