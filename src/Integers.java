import java.util.ArrayList;

public class Integers {
	ArrayList<Integer> nums = new ArrayList();
	
	int addSum(ArrayList<Integer> nums) {
		int sum = 0;
		
		for(int ints: nums) {
			sum = sum + ints;
		}
		return sum;
	}
}
  