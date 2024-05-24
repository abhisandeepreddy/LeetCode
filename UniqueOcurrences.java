import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueOcurrences {
//Done
	public static void main(String args[]) {
		Occurrence oc = new Occurrence();
		int[] arr = new int[] { -3,0,1,-3,1,1,1,-3,10,0 };
		System.out.println(oc.uniqueOccurrences(arr));
	}
}

class Occurrence {

	public boolean uniqueOccurrences(int[] arr) {
		
		int flag;
		Map<Integer, Integer> result1 = new LinkedHashMap<Integer, Integer>();
		for (int num : arr) {

			if (result1.containsKey(num)) {
				int value = result1.get(num);
				value = value + 1;
				result1.replace(num, value);
			} else {
				result1.put(num, 1);
			}
		}

		Object[] valuesArray = result1.values().toArray();
		for (Object num : valuesArray) {
			flag = 0;
			for (int i = 0; i < valuesArray.length; i++) {
				if(valuesArray[i] == num) {
					flag++;
				}
				
			}
			if(flag >= 2)
				return false;
		}
		
		return true;
	}
}