package slidingWindow.easy;
/*
Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.

Example 1:

Input: [2, 1, 5, 1, 3, 2], k=3
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].

Example 2:

Input: [2, 3, 4, 1, 5], k=2
Output: 7
Explanation: Subarray with maximum sum is [3, 4].
 */
public class Q1708_MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        System.out.println(findMaxSumSubArray(2, new int[] {2, 3, 4, 1, 5}));
    }
    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;
        int firstElement = 0;
        for (int i =  0 ; i < arr.length ; i++ ) {
            if (i < k) {
                windowSum = windowSum + arr[i];
            }
            else {
                windowSum = windowSum - arr[firstElement] + arr[i];
                firstElement++;
            }
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return  maxSum;
    }
}
