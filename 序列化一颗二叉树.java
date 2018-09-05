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
import java.util.*;
public class Solution {
   
    String s = "";

    public String Serialize(TreeNode root) {
        if (root == null)
            return s;
        pre(root);
        return s.substring(1, s.length());
    }

    //前序序列化
    public void pre(TreeNode root) {
        if (root == null) {
            s += ",#";
        } else {
            s += "," + root.val;
            pre(root.left);
            pre(root.right);
        }

    }

    //前序反序列化


    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0)
            return null;
        String ss[] = str.split(",");
        return helper(ss);

    }

    // 递归反序列化,感觉是反递归
    int index = 0;
    public TreeNode helper(String ss[]) {
        TreeNode head =new TreeNode(-99);
        if(index>=ss.length)
            return null;

        if (ss[index].equals("#")) {
            index++;
            return null;
        }
       else{
          head.val = ( Integer.parseInt(ss[index]) );
            index++;
            head.left = helper(ss);

            head.right = helper(ss);
            return head;
        }



    }

}