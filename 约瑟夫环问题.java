//两种方法，dp[]，和用数组模拟一个圈
import java.util.*;
public class Solution {
   /** public int LastRemaining_Solution(int n, int m) {
         if(n==0)
             return -1;
        if(n==1)
            return 0;
        int res=0;
        for(int i=2;i<=n;i++)
            res=(res + m )%i;
        return res;
    }
     */
    public int  LastRemaining_Solution(int n, int m){
        if(n==0)
            return -1;
        if(n==1)
            return 0;
        boolean visit[]=new boolean[n];
        int count=0;  //报数0,1,2....m-1
        int size=0;   //已经淘汰的人的总数
       for(int i=0;i<n;i=(i+1)%n){
          if(visit[i])  
              continue;
           count++;
           if(count==m){            //报到m的人要淘汰，总数+1，重新开始报数
               size++;
               visit[i]=true;
               count=0;
           }
           if(size==n)      //这就是最后一个人
               return i;
           
       }
    
    return 0;
    }
}












