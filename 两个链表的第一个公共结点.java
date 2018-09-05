/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.*;
public class Solution {
      public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null)
            return null;
        int m=getLen(pHead1);
        int n=getLen(pHead2);
        int dif=Math.abs(m-n);
        if(m>n){
            while(dif>0){
                dif--;
                pHead1=pHead1.next;
            }
        }else{
            while(dif>0){
                dif--;
                pHead2=pHead2.next;
            }
        }
        while(pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }

        return pHead1;

    }
    public int getLen(ListNode head){
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
            return len;
    }
}