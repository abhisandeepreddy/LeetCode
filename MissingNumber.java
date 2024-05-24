import java.util.Arrays;

public class MissingNumber {
//Done
	public static void main(String args[]) {
		int[] number = new int[] {1};
		NumberMissing numberMissing = new NumberMissing();
		int result = numberMissing.missingNumber(number);
		System.out.println(result);
	}

}

class NumberMissing{
	public int missingNumber(int[] nums) {
		
		Arrays.sort(nums);
		int inital = nums[0];
		if(inital != 0)
			return 0;
		for (int num : nums) {
			if(inital != num) {
				return inital;
			}
			inital++;
		}
		
		return inital;
	}
}