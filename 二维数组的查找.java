/**
 * 暴力做的话时间为O(mn)，我们可以挑特殊的点来相比较
 *  这里我们就是用的右上角，也可以看看左下角是否可以
 * 
 * */
import java.util.*;

public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0)
            return false;
        int m = array.length - 1;
        int n = array[0].length - 1;
        int i = 0, j = 0;
        while (i <= m && j <= n) {
            int t = array[i][n] - target;
            if (t == 0) return true;
            if (t > 0) {
                n--;
            }
            if (t < 0) {

                i++;
            }
        }
        return false;
    }
}