package Bayron_Activity2;

import java.util.Arrays;

public class Bayron_Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers [] = {1,2,3};
		int target = 5;
		
		int result [] = findTwoSum(numbers, target);
		
		if (result != null) {
			System.out.println(Arrays.toString(result));
		}else {
			System.out.println("No matched found");
		}
	}

	public static int[] findTwoSum(int[] numbers, int target) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
