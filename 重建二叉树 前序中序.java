
//中序和后序还难一点，前序就简单了
import java.util.*;
public class Solution {
   
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||pre.length<=0)
            return null;
        if(pre.length==1)
            return new TreeNode(pre[0]);
      return  build(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    public TreeNode build(int pre[],int preStart,int preEnd,int in[],int inStart,int inEnd ){
        if(preStart>preEnd||inStart>inEnd)
            return null;
        TreeNode root= new TreeNode(pre[preStart]);
        int pos=find(in,pre[preStart]);
        root.left=build(pre,preStart+1,preStart+(pos-inStart),in,inStart,pos-1);
        root.right=build(pre,preStart+(pos-inStart)+1,preEnd,in,pos+1,inEnd);
        return root;
    }
    //在中序的位置
    public int find(int a[],int key){
        for(int i=0;i<a.length;i++)
            if(a[i]==key)
                return i;
        return -1;
    }
    
    
    
}