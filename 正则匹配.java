/*动态规划
   dp[i][j]表示s的前i个字符和p的前j个字符是否匹配
https://www.cnblogs.com/sunshine-2015/p/7277315.html

*/
import java.util.*;
public class Solution {
    public boolean match(char[] str, char[] p)
    {
        return isMatch (String.valueOf(str), String.valueOf(p));
    }
      public boolean isMatch (String s, String p) {
        if (p.length() ==0) {
            return s.length() == 0;
        }
        if (p.length() == 1) {
            if (s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                return true;
            }
            return false;
        }
        if (p.charAt(1) != '*') {
            if (s.length() == 0) {
                return false;
            }
            return p.charAt(0) == '.' || p.charAt(0) == s.charAt(0) ? isMatch(s.substring(1), p.substring(1)) : false;
        }
    while (s.length() != 0 && (p.charAt(0) == '.' || p.charAt(0) == s.charAt(0))) {
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            s = s.substring(1);
        }
        return isMatch(s, p.substring(2));
          
       
    }
}