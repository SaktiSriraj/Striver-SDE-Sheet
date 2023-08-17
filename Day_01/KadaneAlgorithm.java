package Day_01;

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.
*/

public class KadaneAlgorithm {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxSum)
                maxSum = sum;

            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
