import java.util.*;
public class Solution {
    //Insert one char from stringstream
    LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else
            map.put(ch,1);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
      for(Character c :map.keySet())
          if(map.get(c)==1)
              return c;
        return '#';
    }
}




import java.util.*;
public class Solution {
    int visit[]=new int [256];
    char res='#';
     Queue<Character>q =new LinkedList<>();
    public void Insert(char ch)
    {
        visit[ch]++;
        if(visit[ch]==1)
            q.offer(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {

        while(!q.isEmpty()&&visit[q.peek()]!=1){
            q.poll();
        }
        if(q.isEmpty()){
            res='#';
            return res;
        }else
            res=q.peek();
        return res;
    }
}