package Day_03;

import java.util.ArrayList;

/*
Given an array of numbers, you need to return the count of reverse pairs.
Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].
*/

public class ReversePairs {
    public static int reversePairs(ArrayList<Integer> arr) {
        // Write your code here.
        int len = arr.size(), cnt = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++)
                if (2 * arr.get(j) < arr.get(i))
                    cnt++;
        }

        return cnt;
    }
}
