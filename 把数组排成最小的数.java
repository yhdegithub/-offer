/**
*   难点就在于重写comparator()函数，首字符不同，直接比；注意数字首字符相同时候，要变化来两个字符串，短的添加首字符直至两个长度相同为止
*    然后才比较；
**/
import java.util.*;
public class Solution {
      public String PrintMinNumber(int [] numbers) {
        StringBuffer res=new StringBuffer("");
        if(numbers==null||numbers.length==0)
            return "";
        int n=numbers.length;
        if(n==1)
            return String.valueOf(numbers[0]);
        //res.append(numbers[0]);
        String val[] =new String[n];
        for(int i=0;i<n;i++)
            val[i]=String.valueOf(numbers[i]);
        Arrays.sort(val, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
           char ch1=o1.charAt(0);
           char ch2=o2.charAt(0);
           int m=o1.length(),n=o2.length();
           if(ch1!=ch2){
           return o1.compareTo(o2);
           }else{
               while(m>n){
                   o2+=ch1;
                   n++;
               }
                while(m<n){
                   m++;
                   o1+=ch1;
                }
               return o1.compareTo(o2);
           }

            }

        });
        for(int i=0;i<n;i++)
            res.append(val[i]);
        return res.toString();

    }
}