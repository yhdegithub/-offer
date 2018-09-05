import java.util.Stack;

public class Solution {
   Stack<Integer>stack1 =new Stack<>();   //正常工作的栈
   Stack<Integer>stack2 =new Stack<>();    //辅助栈
   
    
    public void push(int node) {
        stack1.push(node);
        if(stack2.size()==0||node<=stack2.peek())
            stack2.push(node);
        else
            stack2.push(stack2.peek());
      
    
    }
    
    public void pop() {
       // if(stack2.peek()==stack1.peek())
          stack2.pop();
          stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
        
    }
    
    public int min() {
        return stack2.peek();
    }
}