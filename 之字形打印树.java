import java.util.*;
public class Solution {
     //Z 字形
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > res =new ArrayList<ArrayList<Integer> >();
         if(pRoot==null)
             return res;
         Stack<TreeNode> stack1=new Stack<>();  //奇数层
        Stack<TreeNode> stack2=new Stack<>();    //偶数层
          stack1.push(pRoot);
          int level =1;
      while(!stack1.empty()||!stack2.empty()){
          ArrayList<Integer> t=new ArrayList<Integer>();
          if((level&1)==1){       //奇数层
              while(!stack1.empty()){
                  TreeNode cur=stack1.pop();
                  t.add(cur.val);
                  if(cur.left!=null)
                      stack2.push(cur.left);
                  if(cur.right!=null)
                      stack2.push(cur.right);
              }



          }else{           //偶数层
              while(!stack2.empty()){
                  TreeNode cur=stack2.pop();
                  t.add(cur.val);
                  if(cur.right!=null)
                      stack1.push(cur.right);
                  if(cur.left!=null)
                      stack1.push(cur.left);
              }

          }
          level++;
          res.add(new ArrayList<>(t));



      }
    return res;
    }

}