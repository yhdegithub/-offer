import java.util.*;

public class Solution {
     //判断出栈序列是否正确
    public boolean IsPopOrder(int [] pushA,int [] popA) {

         int n=pushA.length;
         int m=popA.length;
          if(n!=m)
              return false;
          if(n==0)
              return true;
          //if(n==1)
            //  return pushA[0]==popA[0];
          Stack<Integer>stack =new Stack<>();
          stack.push(pushA[0]);
          int i=1,j=0;
           while(!stack.isEmpty()&&j<n){

               while( i<n && stack.peek()!=popA[j])
                   stack.push(pushA[i++]);
               if(stack.peek()==popA[j]){
                   stack.pop();
                   j++;
               }

             if(i==n&&j<n&&stack.peek()!=popA[j])
                 return false;
           }
       if(j>=n&&stack.isEmpty())
           return true;
           return false;


    }
}