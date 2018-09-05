//竟然是fabonia数列
import java.util.*;
public class Solution {
    public int RectCover(int target) {
       if(target==0) return 0;
        if(target==1) return 1;
        if(target==2)  return 2;
        int res=0;
        int b=1,a=2;
        for(int i=3;i<=target;i++){
            res=a+b;
            b=a;
            a=res;
        }
        return res;
    }
}