package BinarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {20, 18, 1, 8, 7, 5, 11, 14, 6};
		Arrays.sort(nums);
		
		int left = 0;
		int right = nums.length - 1;
		int index = binarySearch(nums, left, right);
		
		System.out.println(index);
	}
	
	public static int binarySearch(int[] nums, int left, int right) {
		int mid =  (left + right) / 2;
		int find = 13;
		int index = -1;
		
		if(left > right) {
			return index;
		}
		
		if(find == nums[mid]) {
			return index = mid;
		} else if(find > nums[mid]) {
			left = mid + 1;
			
			return binarySearch(nums, left, right);
		} else if(find < nums[mid]) {
			right = mid - 1;
			
			return binarySearch(nums, left, right);
		}
		
		return binarySearch(nums, left, right);
	}
}
