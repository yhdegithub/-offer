import java.util.*;
public class Solution {
    public String LeftRotateString(String str,int n) {
      if(str==null ||str.length()<=1)
          return str;
        int len=str.length();
            n=n%len;
    StringBuilder sb=new StringBuilder(str.substring(n,len));
            sb.append(str.substring(0,n));
        return sb.toString();
    }
}