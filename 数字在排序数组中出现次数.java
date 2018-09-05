/**
*  先经二分查找找到这个值，然后再由此向两边变扩散之间顺序遍历，花的时间应该要小一些。
*
*
*/
import java.util.*;
public class Solution {
   public static int GetNumberOfK(int [] array , int k) {
     if(array==null) return 0;
     int n=array.length;
     if(n<=0||array[0]>k||array[n-1]<k)
         return 0;
     return getPosition(array,k+0.5)-getPosition(array,k-0.5);

   }
   public static int getPosition(int a[],double key){
       int low=0,high=a.length-1;
       while(low<=high){
           int mid=(low+high)/2;
           double cmp=a[mid]-key;
           if(cmp==0)   return mid;
           else if(cmp>0)
               high=mid-1;
           else
               low=mid+1;
       }
       return low;
   }
}


//另外 2）找出k+0.5 , k-0.5的位置 ，再做个差

//    3) 二分找到第一个k 和最后一个k


public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int firstK = getFirstK(array, k, 0, length-1);
        int lastK = getLastK(array, k, 0, length-1);
        if(firstK != -1 && lastK != -1){
             return lastK - firstK + 1;
        }
        return 0;
    }
    //递归写法
    private int getFirstK(int [] array , int k, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >=0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid-1);
        }else{
            return mid;
        }
    }
    //循环写法
    private int getLastK(int [] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }
}