public class Solution {
    public String ReverseSentence(String str) {
        if(str==null||str.trim().length()<=1)
            return str;
       String res="";
       String a[]=str.split(" ");
       res=a[a.length-1];
     for(int i=a.length-2;i>=0;i--)
         res+=" "+a[i];
    return res;
    }
}