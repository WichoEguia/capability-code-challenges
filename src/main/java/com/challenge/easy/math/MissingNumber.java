package com.challenge.easy.math;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
    # Missing Number

     Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

     Example 1:
         Input: nums = [3,0,1]
         Output: 2
         Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

     Example 2:
         Input: nums = [0,1]
         Output: 2
         Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

     Example 3:
         Input: nums = [9,6,4,2,3,5,7,0,1]
         Output: 8
         Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

     Constraints:

         * n == nums.length
         * 1 <= n <= 104
         * 0 <= nums[i] <= n
         * All the numbers of nums are unique.
 */
public class MissingNumber {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int res = missingNumber(nums);
        System.out.println(res);
    }
}
