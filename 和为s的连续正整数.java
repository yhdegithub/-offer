/*    暴力做法 O(n^2)  
*      最好的做法是滑动窗口 ，双指针 
*
*/
import java.util.ArrayList;
public class Solution {
    ArrayList<ArrayList<Integer> > res =new ArrayList<ArrayList<Integer> >();
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       if(sum<=0)  
           return res;
        int left=1,right=2;
        while(right<=sum/2+1){
            int t= sum-(right-left+1)*(left+right) /2;
            if(t==0){
                ArrayList<Integer> one=new ArrayList<>();
                for(int i=left;i<=right;i++)
                    one.add(i);
                res.add(new ArrayList<>(one));
                right++;
            }else if(t>0)
                right++;
            else
                left++;
            
        }
    
    return res;
    }
}