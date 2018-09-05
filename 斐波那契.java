//递归效率低，可以用dp[]
import java.util.*;
public class Solution {
    public int Fibonacci(int n) {
        if(n==0)   return 0; 
        if(n==1)  return 1;
        int cur=0,a=0,b=1;
       for(int i=2;i<=n;i++){
           cur=a+b;
           a=b;
           b=cur; 
       }
        return cur;
    }
}