
public class twoSum {
//Done
	public static void main(String[] args) {
		int[] number = new int[] { 2, 7, 11, 15 };

		System.out.println(twoSumProblem(number, 9));
	}

	public static int[] twoSumProblem(int[] nums, int target) {

		int arr[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}

}
