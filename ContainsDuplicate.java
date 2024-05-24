import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
//Done
public class ContainsDuplicate {

	public static void main(String args[]) {

		Duplicate duplicate = new Duplicate();
		int[] nums = new int[] {1,2,3,4};
		System.out.println(duplicate.containsDuplicate(nums));
	}
}

class Duplicate {
	public boolean containsDuplicate(int[] nums) {

		Map<Integer, Integer> result = new LinkedHashMap<Integer, Integer>();
		for (int num : nums) {

			if (result.containsKey(num)) {
				int value = result.get(num);
				value = value + 1;
				result.replace(num, value);
			} else {
				result.put(num, 1);
			}
		}
		
		Collection<Integer> values = result.values();
		
		for (int val : values) {
			if(val >= 2 )
				return true;
		}
		
		return false;
	}
}