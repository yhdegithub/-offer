//这道题目已经限制了要使用head推来做，详解参考剑指offer
import java.util.*;
public class Solution {
     ArrayList<Integer> t=new ArrayList<>();
    public void Insert(Integer num) {
       t.add(num);
    }

    public Double GetMedian(){
        int b[]=new int[t.size()];
        for(int i=0;i<t.size();i++)
            b[i]=t.get(i);
      Double res= new Double(0);
      Queue<Integer> max=new PriorityQueue<>(new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
              return o2-o1;
          }
      }); //大根堆，第奇数个

      Queue<Integer> min=new PriorityQueue<>();   //小根堆，第偶数个
    /**
     *   （1）保证两个堆数据差不多一致：把第偶数个放到小根堆，奇数个放到大根堆
     *
     *   （2）保证大根堆最大数<=小根堆最小数：第偶数个时候，插入到小根堆，如果这个数比大根堆头节点小，那么我们要：把这个数据查到大根堆
     *   然后把大根堆的最大数删除，并插入到小根堆中
     **/
     for(int i=0;i<b.length;i++){
         if(i%2==0){                   //第偶数个
             if(min.isEmpty()||max.isEmpty()|| b[i]>=max.peek())
             min.offer(b[i]);
             else{
                 max.offer(b[i]);
                 min.offer(max.poll());
             }
         }else{                  //第奇数个
             if(max.isEmpty()||min.isEmpty()||b[i]<=min.peek())
             max.offer(b[i]);
             else{
                 min.offer(b[i]);
                 max.offer(min.poll());
             }
         }
     }
     int odd=max.size();
     int  even=min.size();
     int num=odd+even;
     if(num<=1)
         return  (double) min.peek();
    if(num%2==0)
        res=(double) (min.peek()+max.peek())/2 ;
     else
         res= (double)min.peek();
     return res;
 }


}