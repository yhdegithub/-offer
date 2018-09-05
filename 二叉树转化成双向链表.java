/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
     //转化成双向链表,中序遍历

  public TreeNode Convert(TreeNode root) {
         if(root==null||(root.left==null&&root.right==null))
             return root;
         //把左子树构建成双向链表，返回表头
         TreeNode left=Convert(root.left);
         TreeNode p=left;
         //找到左边链表的尾巴
         while(p!=null&&p.right!=null)
             p=p.right;
         //加入根节点
      if(left!=null){
          p.right=root;
          root.left=p;
      }
      //把右子树构建双向链表，返回回头结点
      TreeNode right=Convert(root.right);
      //右子树链表不为空，则加入到根之后
      if(right!=null){
          right.left=root;
          root.right=right;
      }
     return left==null?root:left;
    }
	
	
	
	
	
import java.util.*;
public class Solution {
    //把一棵二叉树转化成双向链表
    //把一棵二叉树转化成双向链表,采用中序遍历就可以了
    public TreeNode Convert(TreeNode root) {
   TreeNode head = null;
   Stack<TreeNode> stack = new Stack<>();
    if(root==null||(root.left==null&&root.right==null))
        return root;
      //stack.push(root)
    TreeNode cur = root,pre=null;
    while(!stack.isEmpty() || cur!=null){
        while(cur!=null){
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        if(pre!=null)
            pre.right = cur;
           cur.left = pre;
           pre = cur;
          cur=cur.right;

    }
    head = root;
    while(head!=null&&head.left!=null)
        head = head.left;
    return head;
    }
}
}