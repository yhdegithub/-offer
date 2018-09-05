import java.util.*;
public class Solution {
    int copy[];
      int p = 1000000007;
    public int InversePairs(int[] a) {
        if (a == null || a.length <= 1)
            return 0;
        int n = a.length;
        copy = new int[n];
        return dfs(a, 0, n - 1);
    }

    public int dfs(int a[], int low, int high) {
        if (low >= high){
          // copy[low] =a[low];
            return 0;
        }

        int mid = low + (high - low) / 2;
        int left = dfs(a, low, mid)%p;
        int right = dfs(a, mid + 1, high)%p;
        int sum = 0;         //两边排好序之后，还要计数
        int i = mid, j = high, k = high;
        while (i >= low && j > mid) {

            if (a[i] >= a[j]) {
                sum += j - mid;
                sum= sum%p;
                copy[k--] = a[i--];
            } else {
                copy[k--] = a[j--];
            }


        }
        while (i >= low)
            copy[k--] = a[i--];
        while (j > mid)
            copy[k--] = a[j--];
        for ( i = low; i <= high; i++)
            a[i] = copy[i];
        return (sum + left + right)%p;
    }
}