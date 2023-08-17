package Day_03;

import java.util.Arrays;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.
*/

public class MajorityElementHalf {
    public int majorityElement(int[] nums) {
        int c=0 , n =nums.length;
        Arrays.sort(nums);
        if(n==1)
            return nums[0];
        for(int i = 0;i<n-1;i++){
            if(nums[i]==nums[i+1])
                c++;
            if (c==Math.floor(n/2))
                return nums[i];
        }
        return -1;
    }
}
