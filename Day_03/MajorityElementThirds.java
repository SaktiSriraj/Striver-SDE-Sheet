package Day_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
*/
public class MajorityElementThirds {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length; 
        List<Integer> ans = new ArrayList<>(); 

        HashMap<Integer, Integer> map = new HashMap<>();

        int min = (int)Math.floor(n / 3)+1;

        for (int i = 0; i < n; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], value + 1);

            if (map.get(nums[i]) == min) {
                ans.add(nums[i]);
            }
            if (ans.size() == 2) break;
        }

        return ans;
    }
}
