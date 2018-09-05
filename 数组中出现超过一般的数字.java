/**
*   找出一个数组中出现次数超过一半长度的某个数字，没有则输出0：两种方法
*    1）既然有一个数超过了一般长度，那么它就比其他所有数字出现次数的总和还要打，
*       我们使用hashmap()，挨个遍历，如果一个数在map中出现，则把它的value+1，否则则value-1,
*        如果value<=0 ,那么没有数字超过一半，返回0；  如果value>0,则输出最后一次把value变成+1的数字
*          
*/
import java.util.*;
public class Solution {
public int MoreThanHalfNum_Solution(int [] a) {
	   if(a==null)  return 0;
	   int n=a.length;
	   if(n==0)   return 0;
	   if(n==1)   return a[0];
	   int res=a[0];      //找到最后一次把值变成1的数字，否则不存在
	   int time=1;
	for(int i=1;i<n;i++){
		if(time==0){
			time++;
			res=a[i];
		}else if(a[i]==res)
			time++;
		else
			time--;
	}	
	//判断是否真滴超过一半
    int cnt=0;
	for(int i=0;i<n;i++)
		if(a[i]==res)
          cnt++;			
	if(cnt<n/2+1)  res=0;
	return res;
}



}