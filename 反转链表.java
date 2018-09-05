
//原地逆置
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode pre=head,cur=pre.next,t=cur.next;
        ListNode dummy=head;
        while(cur!=null){
            //保存下一次修改得位置
            t=cur.next;
            //修改前后两个结点的关系
            cur.next=pre;
            pre=cur;
            cur=t;
            if(t!=null)  t=t.next;
        }
        dummy.next=null;  
        return  pre ;
    }
}


//递归转置


public class Solution {
    public ListNode ReverseList(ListNode head) {
          if(head==null || head.next==null)
              return head;
        ListNode t = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return t;
    }
}