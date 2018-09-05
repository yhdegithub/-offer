import java.util.*;
public class Solution {
    ArrayList<Integer> res=new  ArrayList<Integer>();
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k<=0||input==null||input.length<k)
            return res;
        //构建一个大根堆,大小为k，第一个位置不存数
        int a[]=new int[k+1];
        for(int i=0;i<k;i++)
            a[i+1]=input[i];
        for(int i=k/2;i>=1;i--)
            sink(a,k,i);
        /**input中数据顺序输入，和堆的根大小比：比根大或者等于，则不需要加入；
         比根小，则用这个数据替换掉根，根往下调
         */
        int n=input.length;
        for(int i=k;i<n;i++){

            if(input[i]>=a[1])   continue;
            a[1]=input[i];
            sink(a,k,1);

        }


        for(int i=1;i<=k;i++)
            res.add(a[i]);
        return res;


    }


    //下沉函数
    public void sink(int a[],int k,int i){
        while(2*i<=k){      //只要有孩子
            int j=2*i;
            if(j<k&&a[j]<a[j+1])  //j指向较大的那个孩子
                j++;
            if(a[i]<a[j])
                swap(a,i,j);
            i=j;
        }


    }
    //交换
    public void swap(int a[],int k,int j){
        int t=a[k];
        a[k]=a[j];
        a[j]=t;
    }
}