import java.util.*;
public class Solution {
     public boolean isNumeric(char[] str) {
        if(str==null||str.length==0)
            return true;
        int n=str.length;
        if(n==1){
            if(str[0]<='9'&&str[0]>='0')
                return true;
            else
                return false;
        }
        boolean res=true;
        boolean point=false;
        boolean e=false;
        boolean num=false;
        char pre=' ';
        int i=0;


        if(str[0]=='+'||str[0]=='-')
            i++;
        if(i==1){
            pre=str[0];
            num=true;
        }

            for(;i<n;i++){

            char c=str[i];
            if(c=='.'){
                if(pre=='+'||pre=='-'){
                    point =true;
                    pre=c;
                    continue;
                }
                if(point==true || e==true || num==false )   //e.E后面必须为整数
                    return false;
                point =true;
                pre=c;
                continue;
            }else if(c=='e'||c=='E'){
                 if(i==n-1)  
                      return false;
                if(e==true || num==false)
                    return false;
                e=true;
                pre=c;
                continue;
            }else if(c>'9'||c<'0'){
               if(c!='+'&& c!='-')
                return false;
               if(pre!='e'&&pre!='E')
                   return false;
            }

            else
            {
                num =true;
                pre=c;
            }

        }

        return true;
    }
}