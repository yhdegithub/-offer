/**   用递归，出口用逻辑操作判断
*/
import java.util.*;
public class Solution {
    public int Sum_Solution(int n) {
        int res =1;
       boolean t= (n==1) ||( (res=n+Sum_Solution(n-1))>0);
       return res;
    
    }
}