package Day0ne;

/*Given an array nums with n objects colored red, white, or blue,
sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.*/

public class Sort012 {
    public void sortColors(int[] arr) {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;
        int n = arr.length;

        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0: cnt0++; break;
                case 1: cnt1++; break;
                case 2: cnt2++; break;
            }
        }

        i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
    }
}
