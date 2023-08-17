package Day_02;

import java.util.ArrayList;

/*
 You are given a read-only array of N integers with values also in the range [1, N] both inclusive.
 Each integer appears exactly once except A which appears twice and B which is missing.
 The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.
*/

public class RepeatAndMissingNumber {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        
        Integer[] a = new Integer[arr.size()];
        a = arr.toArray(a);
        int []hash = new int[n+1];

        for(int i=0;i<n;i++)
            hash[a[i]]++;


        int r=-1,m=-1;
        for(int i = 1;i<=n;i++){
            if(hash[i] == 2) r = i;
            else if(hash[i] == 0) m = i;

            if(r!=-1 && m!=-1)
                break;
        }
        int[] res={m,r};
        return res;
    }
}
