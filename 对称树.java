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
/**
*   画个对称的树出来观察一下，简单明了
*/
import java.util.*;
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
            return true;
        if(pRoot.left==null&&pRoot.right==null)
            return true;
        if(pRoot.left==null||pRoot.right==null)
            return false;
        return judge(pRoot.left,pRoot.right);
    }
    //
    public boolean judge(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return judge(root1.left,root2.right)&&judge(root1.right,root2.left);
        
    }
}