import java.util.ArrayList;
public class Solution {
     ArrayList<Integer> res=new ArrayList<Integer>();
    public ArrayList<Integer> printMatrix(int [][] a) {
     if(a==null)  return res;
     int rowStart=0,rowEnd=a.length-1;
     int columnStart=0,columnEnd=a[0].length-1;
     while(rowStart<=rowEnd&&columnStart<=columnEnd){
        //四个方向走一圈
         int i=rowStart,j=columnStart;
         for(i=rowStart,j=columnStart;j<=columnEnd;j++)
             res.add(a[i][j]);
            rowStart++;
         for(i=rowStart,j=columnEnd;i<=rowEnd&&i<=rowEnd;i++)
             res.add(a[i][j]);
             columnEnd--;
          for(i=rowEnd,j=columnEnd;i>=rowStart&&j>=columnStart;j--)
              res.add(a[i][j]);
               rowEnd--;
           for(i=rowEnd,j=columnStart;i>=rowStart&&j<=columnEnd;i--)
               res.add(a[i][j]);
           columnStart++;
     }


     return res;
    }
}