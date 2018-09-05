/** 
总结：
     *    个位：当个位数字为0时，有多少次0-9循环，就会出现多少次数字1. 不为0时则额外加上1
     *    其他位数字： 1、为0时，数字1的出现次数为0-9循环的次数*当前位（十位则乘以10，百位则乘以100）
     *               2、为1时，数字1的出现次数为0-9循环的次数*当前位（十位则乘以10，百位则乘以100）再加上
     该数字后一个数字加1。（如14，会有10,11,12,13,14）
     *               3、大于1时，数字1的出现次数为0-9循环的次数*当前位（十位则乘以10，百位则乘以100）
     再加上当前的位数（+10/100/1000.....）
    **/
import java.util.*;
public class Solution {
     public int NumberOf1Between1AndN_Solution(int n) {
      int count=0;
      if(n<=0)
          return 0;
      String s = String.valueOf(n);
      int len = s.length();
      for(int i=0;i<len;i++){

          int k = (int)Math.pow(10,i);
          int temp = n/(k*10) *  k;
           int ch = s.charAt(len-i-1)-'0';
          if(ch>1)
              temp += k;
            else if(ch==1){
                String left = s.substring(len-i);
                if(left.equals(""))
                    left="0";
                temp += Integer.parseInt(left)+1;
          }
        count += temp;
      }
      return count;
    }
}