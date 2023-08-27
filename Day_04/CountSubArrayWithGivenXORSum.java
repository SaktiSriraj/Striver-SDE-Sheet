package Day_04;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.
*/

public class CountSubArrayWithGivenXORSum {
    public static int count(ArrayList<Integer> arr, int x){
        int c = 0, temp = 0, n = arr.size();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);

        for(int i = 0; i < n; i++){
            c ^= arr.get(i);

            int xo = c^x;
            if(map.containsKey(xo))
                temp += map.get(xo);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        return temp;
    }
}
