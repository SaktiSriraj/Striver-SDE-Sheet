package Day_04;

import java.util.HashMap;

public class LargestSubarrayWithKSum {
    int maxLen(int arr[], int n){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int i = -1;
        int sum = 0;
        map.put(sum,i);
        
        while(i<arr.length-1){
            i++;
            sum+=arr[i];
            
            if(map.containsKey(sum)==false)
                map.put(sum,i);
            else{
                int length = i - map.get(sum);
                if (length > maxLength)
                    maxLength = length;
            }
        }
        return maxLength;
    }
}
