import java.util.Stack;
//Done
public class DailyTemp {

	public static void main(String args[]) {

		Temp temp = new Temp();
		int[] temperatures = new int[] { 73,74,75,71,69,72,76,73};
		int[] result = temp.dailyTemperatures(temperatures);
		for (int num : result) {
			System.out.println(num);
		}
	}
}

class Temp {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int idx = stack.pop();
				result[idx] = i - idx;
			}
			stack.push(i);
		}

		return result;
	}
}