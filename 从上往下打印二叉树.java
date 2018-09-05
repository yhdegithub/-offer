
//这又是一个层次遍历？？？？
public class Solution {
    ArrayList<Integer> res =new ArrayList<Integer>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root==null)
            return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                TreeNode cur=queue.poll();
                res.add(cur.val);
                if(cur.left!=null)
                    queue.offer(cur.left);
                if(cur.right!=null)
                    queue.offer(cur.right);
            }
        }
        return res;
    }
}