//用个双指针，复杂度瞬间变成O(n)，暴力做法时间为O(n^2)
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array==null||array.length<=1)
            return res;
        int i=0,j=array.length-1;
        while(i<=j){
            if(array[i]+array[j]==sum){
                res.add(array[i]);
                res.add(array[j]);
                return res;
            }else if(array[i]+array[j]>sum)
                j--;
            else
                i++;
        }
    return res;
    }
}