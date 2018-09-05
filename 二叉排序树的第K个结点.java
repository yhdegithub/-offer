/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//中序非遍历到第K个结点
import java.util.*;
public class Solution {
     TreeNode KthNode(TreeNode root, int k)
    {
        if(root==null||k<=0)
            return null;
        int count=0;
        Stack<TreeNode> stack =new Stack<>();

        TreeNode cur=root;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;

            }
            cur=stack.pop();
            count++;
            if(count==k)
                return cur;
             cur=cur.right;
        }



        return null;
    }


}
//中序递归

import java.util.*;
public class Solution {
  //递归查找
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null || k <= 0)
            return null;
         target = null;
         left = k;
        return inOrder(pRoot,k);
    }
    //
    TreeNode target = null;
    int left=0;
    public TreeNode inOrder(TreeNode root,int k){
        if(root==null)
            return target ;
        inOrder(root.left,left);
          left--;
        if(left==0){
            target=root;
            return target;
        }
            
        inOrder(root.right,left);
        return target;
    }



}