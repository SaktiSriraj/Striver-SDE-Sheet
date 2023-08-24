package Day_04;


/*
Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target.
Otherwise, return NO.

2nd variant: Return indices of the two numbers such that their sum is equal to the target.
Otherwise, we will return {-1, -1}.

Note: You are not allowed to use the same element twice.
Example: If the target is equal to 6 and num[1] = 3, then nums[1] + nums[1] = target is not a solution.
*/

public class PairSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[]={0,0};
        for (int i = 0;i<n;i++){
            for (int j = 0; j<n;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
    
}
