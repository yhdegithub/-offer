import java.util.*;
public class Solution {
      public int movingCount(int k, int m, int n) {
        if(k<0||m<=0||n<=0)
            return 0;
        if(k==0)
            return 1;
        int count=0;
         boolean visit[][]=new boolean[m][n];
         visit[0][0]=true;
         dfs(visit,0,0,k,m,n);
         for(int i=0;i<m;i++)
             for(int j=0;j<n;j++)
                 if(visit[i][j])
                     count++;
         return count;
    }
    //遍历一遭，采用的是回溯法
    public void dfs(boolean visit[][],int i,int j,int k,int m,int n){
        //出口
        if(!isRight(i,j,k)){
            return;
        }
        //子递归，朝四个方向走吧
        if(j<n-1&&j>=0&&!visit[i][j+1]&&isRight(i,j+1,k)){   //right
            visit[i][j+1]=true;
            dfs(visit,i,j+1,k,m,n);
        }
        if(j<=n-1&&j>0&&!visit[i][j-1]&&isRight(i,j-1,k)){   //left
            visit[i][j-1]=true;
            dfs(visit,i,j-1,k,m,n);
        }
        if(i>0&&i<=m-1&&!visit[i-1][j]&&isRight(i-1,j,k)){   //up
            visit[i-1][j]=true;
            dfs(visit,i-1,j,k,m,n);
        }
        if(i<m-1&&i>=0&&!visit[i+1][j]&&isRight(i+1,j,k)){   //down
            visit[i+1][j]=true;
            dfs(visit,i+1,j,k,m,n);
        }
    }
   public boolean isRight(int i,int j,int k){
        int sum=0;
        while(i!=0||j!=0){
            sum+=i%10;
            sum+=j%10;
            i=i/10;
            j=j/10;
        }
        return sum<=k;
   }
}