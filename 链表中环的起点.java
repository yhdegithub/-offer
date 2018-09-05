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