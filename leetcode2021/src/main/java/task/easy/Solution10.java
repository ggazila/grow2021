package task.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Solution10 {
	public int sumOddLengthSubarrays(int[] arr) {
		List<int[]> list = new ArrayList<>();
		int iterate = 1;
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (i + iterate <= arr.length) {
					list.add(Arrays.copyOfRange(arr, i, i + iterate));
				}
			}

			iterate += 2;
			if (iterate > arr.length) {
				break;
			}
		}
		int sum = 0;
		for (int[] is : list) {
			for (int i : is) {
				sum += i;
			}
		}
		return sum;
	}

	public int fasterSolution(int[] arr) {
		int[] array = arr;
		int arrayLength = arr.length;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			int start = arrayLength - i;
			int end = 1 + i;
			int oddLength;
			int substring = start * end;

			if (substring % 2 != 0) {
				oddLength = substring / 2 + 1;
			} else {
				oddLength = substring / 2;
			}

			sum += oddLength * array[i];

		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Solution10().sumOddLengthSubarrays(new int[] { 1, 4, 2, 5, 3 }));
		System.out.println(new Solution10().sumOddLengthSubarrays(new int[] { 1, 2 }));
		System.out.println(new Solution10().sumOddLengthSubarrays(new int[] { 10, 11, 12 }));
		System.out.println(new Solution10().fasterSolution(new int[] { 1, 4, 2, 5, 3 }));
		System.out.println(new Solution10().fasterSolution(new int[] { 1, 2 }));
		System.out.println(new Solution10().fasterSolution(new int[] { 10, 11, 12 }));

	}
}

/*
 * 1588. Sum of All Odd Length Subarrays Easy
 * 
 * 854
 * 
 * 94
 * 
 * Add to List
 * 
 * Share Given an array of positive integers arr, calculate the sum of all
 * possible odd-length subarrays.
 * 
 * A subarray is a contiguous subsequence of the array.
 * 
 * Return the sum of all odd-length subarrays of arr.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: arr = [1,4,2,5,3] Output: 58 Explanation: The odd-length subarrays of
 * arr and their sums are: [1] = 1 [4] = 4 [2] = 2 [5] = 5 [3] = 3 [1,4,2] = 7
 * [4,2,5] = 11 [2,5,3] = 10 [1,4,2,5,3] = 15 If we add all these together we
 * get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58 Example 2:
 * 
 * Input: arr = [1,2] Output: 3 Explanation: There are only 2 subarrays of odd
 * length, [1] and [2]. Their sum is 3. Example 3:
 * 
 * Input: arr = [10,11,12] Output: 66
 * 
 * 
 * Constraints:
 * 
 * 1 <= arr.length <= 100 1 <= arr[i] <= 1000
 * 
 */