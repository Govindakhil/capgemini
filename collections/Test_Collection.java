package capgemini.collections;

import java.util.Arrays;

public class Test_Collection {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2, 5 };
		for (int index = 0; index < nums.length; index++) {
			System.out.println(nums[index]);
		}
		System.out.println("Natural Order:" + Arrays.toString(nums));

		// enhanced for loop ....not indexed based..
		for (int num : nums) {
			System.out.println(num);
		}

		// algorithms for arrays
		Arrays.sort(nums);
		System.out.println("Sorted Order:" + Arrays.toString(nums));

		// char array....
		char[] alpha = { 'A', 'C', 'B', 'F', 'E' };
		System.out.println("Natural order:" + Arrays.toString(alpha));

		Arrays.sort(alpha);
		System.out.println("Sorted Order:" + Arrays.toString(alpha));

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thus", "Fri", "Sat" };
		System.out.println("Natural order:" + Arrays.toString(days));

		Arrays.sort(days);
		System.out.println("Sorted Order:" + Arrays.toString(days));

	}

}
