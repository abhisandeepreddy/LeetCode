
public class SingleNumber {
//Done
	public static void main(String args[]) {
		int[] number = new int[] {2,2,1};
		NumberSingle numberSingle = new NumberSingle();
		int result = numberSingle.singleNumber(number);
		System.out.println(result);
	}
}

class NumberSingle{
	public int singleNumber(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int flag = 0;
			int compare = nums[i];
			for (int num: nums) {
				
				if(compare == num)
					flag++;
				
				if(flag == 2)
					break;
			}
			if (flag == 1) 
				return nums[i];
		}
		
		return 0;
	}
}
