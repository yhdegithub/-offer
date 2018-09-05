/**
*  最容易的想到的：1）再建一个数组，遍历原来的数组求得奇数长度k，再遍历一次，
*                  遇到奇数，就从0..k-1.遇到偶数就k..n-1，慢慢插，保证了顺序不变，过程中也可以使用队列栈
*                   简述为重写。
*                2）试试双指针法
*   
*/
import java.util.*;
public class Solution {
    public void reOrderArray(int [] array) {
        int n=array.length;
        if(n<=1)
            return;
        int count=0;       //奇数个数
        for(int i=0;i<n;i++)
            if(array[i]%2==1)
                count++;
        int a[]=new int[n];  //存放结果
        int j=count;
        int  k=0;
        for(int i=0;i<n;i++){
            if(array[i]%2==1)
                a[k++]=array[i];
            else
                a[j++]=array[i];

        }
        for(int i=0;i<n;i++)
            array[i]=a[i];






    }
}