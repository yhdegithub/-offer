/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
/**
*  中序遍历的后继一个节点，后继结点不可能在它的左子树上，要么在祖先，要么在右子树，现有：
            1）有右孩子存在：后继结点为右孩子的最左边的一个孩子
            2）没有右孩子存在，又分成两类：
                     a.它是父亲节点的左孩子，则后继结点为父亲结点
                     b.他是父亲节点的右孩子，那么后继结点为某个祖先的父亲：该祖先为它父亲的左孩子。 如果一直找到
                     根节点去了，那么后继就不存在了
*
*
*/
import java.util.*;
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)  
            return  null;
        if(pNode.right!=null){       //右孩子存在,找右孩子的最左边孩子
            TreeLinkNode cur=pNode.right;
            while(cur.left!=null)
                cur=cur.left;
            return cur;
        }else{      //没有右孩子，必须往祖先里找
            TreeLinkNode par = pNode;
            if(par==null)  return null;
            else if(par.left==pNode)  return par;   //(2)  a
             else{                                     //(2) b
                while(par.next!=null&&par.next.left!=par)
                    par=par.next;
                 return par.next;
             }
        }
    }
}









