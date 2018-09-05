import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res =new ArrayList<Integer>();
        int n=num.length;
        if(size>n||size<=0)
            return res;
        //双端队列
        Deque<Integer>queue=new LinkedList<>();
        int pos=-1;    //记录最大值的位置
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=size;
        for(j=i+size-1,i=0;j<n;j++,i++){
            int key=get(num,i,j);

            res.add(key);

        }



        return res;
    }

    public int get(int num[],int i,int j){
        int max=num[i];
        for(int k=i;k<=j;k++)
            if(num[k]>=max)
                max=num[k];
        return max;
    }
    
    
}