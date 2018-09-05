
//递归一次即可
import java.util.*;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        return 1+ Math.max(TreeDepth(root.left),TreeDepth(root.right));
    }
}





*/
/**
*两种方法，一是递归，二是层次遍历得到高度,递归太简单，我用下层次遍历好了,每一层就level++
*/
import java.util.*;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
         int level=0;
       while(!queue.isEmpty()){
            int n=queue.size();
           for(int i=0;i<n;i++){
               TreeNode cur=queue.poll();
               if(cur.left!=null)
                   queue.offer(cur.left);
               if(cur.right!=null)
                   queue.offer(cur.right);
           }
           level++;
       }
    return level;
    }
}