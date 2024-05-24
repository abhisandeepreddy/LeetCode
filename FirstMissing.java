import java.util.Arrays;
//Done
public class FirstMissing {
	public static void main(String args[]) {
		int[] number = new int[] {3,4,-1,1};
		MissingFirst missingFirst = new MissingFirst();
		int result = missingFirst.missingNumber(number);
		System.out.println(result);
	}

}

class MissingFirst{
	public int missingNumber(int[] nums) {
		
		Arrays.sort(nums);
		int inital = 0;
		for (int num: nums) {
			if(num > 0)
				inital = num;	
		}
		
//		if(inital != 1)
//			return 1;
		for (int num : nums) {
			if (inital != 0) {
				if(inital != num) {
					return inital;
				}
				inital++;				
			}
		}
		
		return inital;
	}
}