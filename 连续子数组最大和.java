import java.util.*;
public class Solution {
    public int FindGreatestSumOfSubArray(int[] a) {

        if (a == null || a.length == 0)
            return 0;
        int n = a.length;
        int cur = a[0];
        int max = a[0];
        if (n == 1)
            return max;
        for(int i=1;i<n;i++){
            cur = Math.max(cur+a[i],a[i]);
            max = Math.max(max,cur);
        }
      return max;
    }
}