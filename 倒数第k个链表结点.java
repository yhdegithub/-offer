/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/**  注意可能结点数目没有k大，那就拜拜了
* 最简单的先遍历一次找出结点数目n，再找出第n-k+1个结点，两次遍历
*  另外一种设置两个指针，一个先走一个后走
*
**/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
         if(head==null||k<=0)
             return null;
        ListNode fast=head,slow=head;
        //倒数第K个可能不存在哦,fast先走k-1步
        for(int i=0;i<k-1;i++)
        {
            fast=fast.next;
            if(fast==null)
                return null;
        } 
         while(fast.next!=null){
             slow=slow.next;
             fast=fast.next;
         }
    
     return slow;
    }
}