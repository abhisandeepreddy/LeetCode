
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElement {
//Done
	public static void main(String args[]) {

		Element ele = new Element();
		int[] nums = new int[] { 3,2,3 };
		System.out.println(ele.majorityElement(nums));
	}
}

class Element {

	public List<Integer> majorityElement(int[] nums) {

		Map<Integer, Integer> result1 = new LinkedHashMap<Integer, Integer>();
		for (int num : nums) {

			if (result1.containsKey(num)) {
				int value = result1.get(num);
				value = value + 1;
				result1.replace(num, value);
			} else {
				result1.put(num, 1);
			}
		}

		List<Integer> result = new ArrayList<>();
        int output = result1.get(nums[0]);
		for (int num : nums) {
			if (output < result1.get(num)) {
				output = result1.get(num);
				result.add(num);
			}
			else if (output == result1.get(num)) {
				if(!(result.contains(num))) {
					result.add(num);
				}
				
			}
			
		}
		
		return result;
	}
}