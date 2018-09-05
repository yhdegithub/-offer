public class Solution {
      /*
    *    求 第 i 个 丑数
    * */
    public int GetUglyNumber_Solution(int n) {

        if(n<=1)
            return n;
        int num[]  = new int [n+1];
        num[0]=1;
        int i2=0,i3=0,i5=0;
        for(int i=1;i<n;i++){
            int temp = Math.min( num[i2]*2,Math.min(num[i3]*3,num[i5]*5) );
            if(temp == num[i2]*2)
                i2++;
            if(temp == num[i3]*3)
                i3++;
            if(temp == num[i5]*5)
                i5++;
            num[i] = temp;
        }
        return num[n-1];
    }
}