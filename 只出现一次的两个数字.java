//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果



//使用位运算
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
/**
*   方法很多，直接的可以用map，但是更加推荐用剑指上的方法
*
**/
import java.util.*;
public class Solution {
    public  void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            if(array==null||array.length<=1)
                return ;
            int n=array.length;
            int res=0;
            num1[0]=0;
            num2[0]=0;
            //计算异或，划分两个数组，分别异或
        for(int i=0;i<n;i++)
            res=res^array[i];
        int pos=findFirst_1(res);  //第几位为1
        for(int i=0;i<n;i++){
            if(is_1(array[i],pos)){
                num1[0]=num1[0]^array[i];
            }else{
                num2[0]=num2[0]^array[i];
            }
        }

    }
    //查找第一个为1的比特位
    public int findFirst_1(int res){
        int pos=0;
        while((res&1)!=1){
            pos++;
            res>>=1;
        }
    return pos;
    }
    //第pos位是否为1
    public boolean is_1(int n,int pos){

        int k = n>>pos;
        if((1&k)==1)
            return true;
        return false;


    }
}




//使用map
import java.util.*;
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=array.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(array[i]))
                map.put(array[i],map.get(array[i])+1);
            else
                map.put(array[i],1);
        }
      //
        int j=0,times=1;
        for(int i=0;i<n;i++)
            if(map.get(array[i])<2)
            {
                if(times++==1)  num1[0]=array[i];
              else
                   num2[0]=array[i];
            }
      
    
    
    
    }
}