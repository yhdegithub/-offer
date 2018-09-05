import java.util.*;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0)
            return 0;
        int n=array.length;
        if(n==1)
            return array[0];

        int min=0;
        int i=0,j=n-1;
        if(array[i]<array[j])
            return array[0];
        while(i<j-1){
            int mid=i+(j-i)/2;
            int dif=array[mid]-array[i];
            if(dif>0)
                i=mid;
            else if(dif<0)
                j=mid;
            else{
                for(int k=i;k<=j;k++)
                    if(array[k]<=min)
                        min=array[k];
                break;
            }
            if(i==j-1||j+1==i)
                break;
        }
        min = Math.min(array[i],array[j]);
        return min;
    }
}