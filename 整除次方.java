import java.util.*;
public class Solution {
    public double Power(double base, int n) {
        if(n==1)
            return base;
        else if(n==0)
            return 1.0;
        else if(n>1){
            if((n&1)==1)
               return Power(base * base , n/2) * base;
            else
                return Power(base * base , n/2);
        }else 
            return 1/Power(base,-n);
  }
}