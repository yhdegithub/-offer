import java.util.ArrayList;
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
     ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer>  one =new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null)
            return res;
        dfs(root,target);
        return res;
    }
    //回溯法
    public void dfs(TreeNode root,int target){
            one.add(root.val);
            target-=root.val;
        //出口
        if(root.left==null && root.right==null){
            if(target==0){
                res.add(new ArrayList<>(one));
            }
            return;

        }
        //子情况

        if(root.left!=null){
            dfs(root.left,target);
            one.remove(one.size()-1);
        }
        if(root.right!=null){
            dfs(root.right,target);
            one.remove(one.size()-1);
        }


    }
}