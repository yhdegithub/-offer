
import java.util.*;
public class Solution {
        ListNode cur=null;       //快慢指针的相遇节点
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null)
            return null;
        ListNode slow=pHead,fast=pHead.next;
        if(!hasCycle(pHead))
            return null;
        //从相遇节点再走pHead到环起点的长度
        slow=pHead;
        while(slow!=cur){
            slow=slow.next;
            cur=cur.next;
        }
        return cur;
    }
    //判断有无环，有环则求出相遇的节点处
    public boolean hasCycle(ListNode head){
        if(head==null||head.next==null)
            return false;
        if(head.next==head){
            cur=head;
            return true;
        }
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cur=fast; 
                return true;
            }
               
        }
        return false;
    }
    
    
}









//这道题其实也可以借助HashMap(),顺路求出环的长度
import java.util.*;
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode cur=pHead;
        if(pHead==null)
            return null;
        int index=0;
        HashMap<ListNode,Integer> map =new HashMap<>();
        while(cur!=null){
            if(cur==null)
                return null;
           else if(map.containsKey(cur)){
               return cur;
              
           }
            else 
                map.put(cur,index++);
               cur=cur.next;
            
        }
    return cur;
    }
}











