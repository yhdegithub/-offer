/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//用递归试试
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)  return list2;
        if(list2==null)  return list1;
        ListNode head;
        if(list1.val<=list2.val)
        {
            head=list1;
            head.next=Merge(list1.next,list2);
        } 
        else
        {
            head=list2;
            head.next=Merge(list1,list2.next);
        }
       
       return head;
      
    }
}