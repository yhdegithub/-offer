public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    
    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.val != t.val) return false;
        
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}


//这道题请看leetcode的572,剑指offer上与这道572的子树条件是不同的 ， 上面是leetcode的解答 ， 下面的才是剑指offer


import java.util.*;
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null || root1==null)
            return false;
        if(dfs(root1,root2))
            return true;
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    public boolean dfs(TreeNode root1 , TreeNode root2){
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val != root2.val)
            return false;
        return dfs(root1.left,root2.left) && dfs(root1.right , root2.right);
        
        
    }
}






//扩展 对称树

import java.util.*;
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
            return true;
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode l ,TreeNode r){
        if(l==null && r==null)
            return true;
        if(l==null || r==null)
            return false;
         if(l.val!=r.val)
             return false;
        return dfs(l.left,r.right) && dfs(l.right,r.left);
        
    }
}