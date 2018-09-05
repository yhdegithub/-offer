import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<=0)
            return false;
        
        int n=numbers.length;
        if(n==1)
            return true;
        Arrays.sort(numbers);
        int cnt=0;   //大小王的个数
        int i=0;
        for(;i<=3;i++)
            if(numbers[i]==0)
            cnt++;
           else
               break;


        //开始查找是否顺序
        for(i=i+1;i<n;i++){
            int dif=numbers[i]-numbers[i-1];
            if(dif==1)
                continue;
            else if(dif==0)
                return false;
            else{
                dif--;
                if(cnt<dif)
                    return false;
                else{
                    cnt-=dif;
                }
            }
        }
        return true;
    }
}