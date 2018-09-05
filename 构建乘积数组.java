//用动态规划
import java.util.*;
public class Solution {
     int res[];
    public int[] multiply(int[] A) {
        if(A==null||A.length==0)
            return res;
        int n=A.length;
        res=new int[n];
        int c[]=new int[n]; c[0]=1;
        int d[]=new int[n];d[n-1]=1;
        for(int i=1;i<n;i++)
            c[i]=c[i-1]*A[i-1];
        for(int i=n-2;i>=0;i--)
            d[i]=d[i+1]*A[i+1];

        for(int i=0;i<n;i++)
            res[i]=c[i]*d[i];
        return res;
    }
}