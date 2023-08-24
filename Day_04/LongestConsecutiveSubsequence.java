package Day_04;

import java.util.Arrays;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
*/

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;

        }
        Arrays.sort(nums);
        int ls=1;
        int cs=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    cs+=1;
                }
                else{
                    ls=Math.max(ls,cs);
                    cs=1;
                }
            }
        }
        return Math.max(ls,cs);
    }
}
