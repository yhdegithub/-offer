import java.util.*; 
public class Solution {
   
public boolean VerifySquenceOfBST(int [] a) {
        int n=a.length;
        if(n==0)
            return false;
        return judge(a,0,n-1);
    }

    public  boolean judge(int a[],int low,int high){
        if(high<=low)
            return true;
        int key = a[high];
        boolean left=true,right=true;
        int pos=get(a,low,high,key);
        if(pos==high)
            return true;
        for(int i=low;i<pos;i++)
            if(a[i]>key)
                return false;
        for(int i=pos;i<=high;i++)
            if(a[i]<key)
                return false;

        return judge(a,low,pos-1) && judge(a,pos,high-1);


    }

    public int get(int a[],int low,int high,int key){

        for(int i=low;i<=high;i++)
            if(a[i]>key)
                return i;
        return  high;

    }
}