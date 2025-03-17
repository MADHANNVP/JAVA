import java.util.*;
class leedcod3{
    public static void main(String[] args)
    {
        String s="abcabcbb";
        int start=0,end=0,max_size=0;
        List<Character> list = new ArrayList<Character>();
        while(end<s.length())
        {
            if(!list.contains(s.charAt(end)))
            {
                list.add(s.charAt(end));
                end++;
                max_size=Math.max(max_size,list.size());
            }
            else
            {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.println(max_size);
    }
}