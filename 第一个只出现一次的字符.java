import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
		if(str==null||str.length()==0)
			return -1;
		int n=str.length();
		if(n==1)
			return 0;
        HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++){
			char ch= str.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
			
		}
		//找出来
		for(int i=0;i<n;i++)
		if(map.get(str.charAt(i))==1)
			return i;
		
		
		
		
		
		
		return -1;
    }
}