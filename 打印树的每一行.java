
import java.util.*;
//这不就是一个层次遍历嘛
public class Solution {
     ArrayList<ArrayList<Integer> > res=new  ArrayList<ArrayList<Integer> >();
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
       if(pRoot==null)
           return res;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> t=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode cur=queue.poll();
                t.add(cur.val);
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
            res.add(new ArrayList<>(t));
            
        }
          return res;
    }
    
}