
public class FindingDuplicate {
	public static void main(String args[]) {
		int[] number = new int[] {1,2,3,4,5,5};
		DuplicateFinding duplicateFinding = new DuplicateFinding();
		int result = duplicateFinding.findDuplicate(number);
		System.out.println(result);
	}
}

class DuplicateFinding{
	
	public int findDuplicate(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int flag = 0;
			int compare = nums[i];
			for (int num: nums) {
				
				if(compare == num)
					flag++;
				
			}
			if(flag >= 2)
				return nums[i];
		}
		
		return 0;

	}
}
