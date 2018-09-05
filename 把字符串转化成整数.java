import java.util.*;
public class Solution {
    public int StrToInt(String str) {
           int res=0;
           if(str==null||str.length()==0)
               return 0;
           int n=str.length();
           if(n==1&&(str.charAt(0)>'9'||str.charAt(0)<'0'))
               return 0;
           int pos=1;
           int i=0;     //指针
           if(str.charAt(0)=='-'){
               i++;
               pos=-1;
           }else if(str.charAt(0)=='+')
               i++;
              for(;i<n;i++){
                  char ch=str.charAt(i);
                  if(ch>'9'||ch<'0')
                      return 0;
                  res = res*10+str.charAt(i)-'0';
              }
              return res*pos;
    }
}