//这道题就是超级简单的动态规划嘛dp[i]=dp[i-1]+dp[i-2],和斐波那契的状态方程都一样
import java.util.*;
public class Solution {
    public int JumpFloor(int target) {
         if(target==0) 
             return 0;
        if(target==1)
            return 1;
        if(target==2)
            return 2;
        int a=1,b=2,sum=0;
        for(int i=3;i<=target;i++){
            sum=a+b;
            a=b;
            b=sum;
            
        }
    return sum;  
    }
}