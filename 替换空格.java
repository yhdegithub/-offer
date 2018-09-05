import java.util.*;
public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str==null)
            return null;
        int n=str.length();
        int count=0;        //记载空格的数目
        for(int i=0;i<n;i++)
            if(str.charAt(i)==' ')
                count++;
        char res[]=new char[n+2*count];
        int j=n+2*count-1;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                res[j--]=str.charAt(i);
            }else{
                res[j--]='0';
                res[j--]='2';
                res[j--]='%';
            }
        }
        return String.valueOf(res);
    }
}