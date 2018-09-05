
//递归即可
import java.util.ArrayList;
public class Solution {
     ArrayList<Integer> res=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {       
        if(listNode==null)
            return res;
        printListFromTailToHead(listNode.next);
         res.add(listNode.val);
        return res;
    }
}