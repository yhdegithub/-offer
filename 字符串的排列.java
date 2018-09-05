import java.util.*;
public class Solution {
       //返回全排列，采用回溯法
    ArrayList<String> res=new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
          if(str==null||str.length()==0)
              return res;
          int n=str.length();
          boolean visit[]=new boolean[n];
          for(int i=0;i<n;i++){
              String s="";
              s+=str.charAt(i);
              visit[i]=true;
              dfs(s,str,visit);
             visit[i]=false;
          }

          return res;
    }
    //
    public void dfs(String s,String str,boolean visit[]){
        //递归出口
        if(s.length()==str.length()){
                     if(!res.contains(s))
                      res.add(new String(s));
                      return;
                  }
         //子情况
        for(int i=0;i<str.length();i++){
           if(visit[i])
               continue;
             visit[i]=true;
             s+=str.charAt(i);
            dfs(s,str,visit);
            s=s.substring(0,s.length()-1);
            visit[i]=false;
        }
    }
}