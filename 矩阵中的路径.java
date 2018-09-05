import java.util.*;
public class Solution {
     public boolean hasPath(char[] m, int rows, int cols, char[] str)
    {
        char matrix[][]=new char[rows][cols];
        for(int i=0;i<rows*cols;i++)
            matrix[i/cols][i%cols]=m[i];
        return hasPath(matrix,rows,cols,str);

    }
    boolean res=false;
    public boolean hasPath(char[][] matrix, int rows, int cols, char[] str)
    {
        if(str==null||matrix==null)
            return true;
        int m=matrix.length;
        int n=matrix[0].length;
        boolean visit[][]=new boolean[m][n];
        //回溯法
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(str[0]==matrix[i][j]){
                    visit[i][j]=true;
                    dfs(matrix,visit,str,1,i,j);
                    if(res) return res;
                    visit[i][j]=false;
                }
            }
        return false;
    }
    //
    public void dfs( char matrix[][],boolean visit[][],char str[],int start,int i,int j){
        if(start>=str.length){
            res=true;
            return;

        }
        //向右
        if(j<matrix[0].length-1 && visit[i][j+1]==false && str[start]==matrix[i][j+1]){
            visit[i][j+1]=true;
            dfs(matrix,visit,str,start+1,i,j+1);
            visit[i][j+1]=false;
        }
        //向左
        if(j>0 && visit[i][j-1]==false && str[start]==matrix[i][j-1]){
            visit[i][j-1]=true;
            dfs(matrix,visit,str,start+1,i,j-1);
            visit[i][j-1]=false;
        }
        //向上
        if(i>0 && visit[i-1][j]==false && str[start]==matrix[i-1][j]){
            visit[i-1][j]=true;
            dfs(matrix,visit,str,start+1,i-1,j);
            visit[i-1][j]=false;
        }
        //向下
        if(i<matrix.length-1&& visit[i+1][j]==false && str[start]==matrix[i+1][j]){
            visit[i+1][j]=true;
            dfs( matrix,visit,str,start+1,i+1,j);
            visit[i+1][j]=false;
        }


    }


}