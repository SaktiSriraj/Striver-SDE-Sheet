package Day_02;


/*
Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array?
Definition: for all i & j < size of array, if i < j
then you have to find pair (A[i],A[j]) such that A[j] < A[i].
*/

public class CountInversions {

    public static long getInversions(long arr[], int n) {
        int count=0;

        for(int i=0 ;i<n ;i++){
            for(int j=i+1 ;j<n ;j++){
                if(arr[i]>arr[j])
                    count++;
            }
        }

        return count;
    }
}
