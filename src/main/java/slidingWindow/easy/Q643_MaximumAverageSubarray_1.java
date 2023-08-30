package slidingWindow.easy;
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.



Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000


Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */
public class Q643_MaximumAverageSubarray_1 {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3},4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = Integer.MIN_VALUE;
        double windowSum = 0;
        int firstElementOfWindow  = 0;
        for (int i =0; i< nums.length ; i++) {
            if(i < k) {
                windowSum = windowSum + nums[i];
            }
            else {
                windowSum = windowSum - nums[firstElementOfWindow] + nums[i];
                firstElementOfWindow++;
            }
            maxSum = Math.max(windowSum,maxSum);

        }
        return  maxSum/k;
    }
}

