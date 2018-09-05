/**   n个1中间插入k块木板，共计2^（n-1）块
 *      原理详解：跳n层台阶，可以跳1步，2步.....n步，相当于有n个1，在这n个1中间插入k板子块板子
 *      板子数目可以为0,1,2....n-1块，分别对应跳1步，2步...n步，所以共有
 *      组合 C(n-1,0)+C(n-1,1)+C(n-1,2)+......C(n-1,n-1)==2^(n-1)次方放置的方法
 */
import java.util.*;
public class Solution {
    public int JumpFloorII(int target) {

        if(target<=1)  return 1;
         return (int) Math.pow(2,target-1);

    }
}