
//树的通常用递归
public class Solution {
    public void Mirror(TreeNode root) {
        //出口
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            return;
        //先左右孩子递归使用，最后再自己调用       
        Mirror(root.left);
        Mirror(root.right);
        TreeNode temp=root.left;
          root.left=root.right;
          root.right=temp; 
        return ;
    }
}