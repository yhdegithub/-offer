public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)
			return pHead;
		   RandomListNode newHead,cur=pHead;
		   //复制结点
		   while(cur!=null){
	        RandomListNode t=new  RandomListNode(cur.label);		   
			   t.next=cur.next;
			   cur.next=t;
			   cur=t.next;
			   
		   }
		  
       //修改random
	    cur=pHead;
	    while(cur!=null){
			if(cur.random!=null)      //注意越界问题
			cur.next.random=cur.random.next;
			cur=cur.next.next;
		}
	
	    //分离
		RandomListNode temp;
		newHead=pHead.next;
		cur=pHead;
		while(cur!=null){
			temp=cur.next;
			cur.next=temp.next;
			if(temp.next!=null)
    temp.next=temp.next.next;	
	cur=cur.next;
		}
		
		
	return newHead;
	}
}