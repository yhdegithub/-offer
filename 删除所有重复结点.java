/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
     //删除所有重复节点
    public ListNode deleteDuplication(ListNode pHead) {
       if(pHead==null||pHead.next==null)
           return pHead;
       //至少要有两个节点
        ListNode dummy =new  ListNode(-99); dummy.next=pHead ;
        ListNode pre=dummy,cur=pHead,sub=cur.next;;
         while(pre !=null){
             if(  cur==null ||sub==null|| cur.val!=sub.val){
              pre.next=cur;
              pre=cur;
              if(pre==null)
                  continue;
              cur=sub;
              if(sub!=null)
              sub=sub.next;

             }else{
                 while(sub!=null&&sub.val==cur.val)
                       sub=sub.next;
                 cur=sub;
                 if(sub!=null)
                 sub=sub.next;
             }

         }
         return dummy.next;
    }
}