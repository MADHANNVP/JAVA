class Solution {
    public boolean isValid(String s) {
        boolean yes=true;
        boolean no=false;
        int count=0;
        if(s.length()%2==1)
        {
            return no; 
        }
        else
        {
        for(int i=0;i<s.length();i++)
        {
            System.err.println(s.charAt(i));
            if(s.charAt(i)==('('))
            {
                for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)==(')'))
                {
                    System.err.println(s.charAt(i));
                  count++;
                  break;
                }
            }
            }
             if(s.charAt(i)==('{'))
            {
                for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)==('}'))
                {
                  count++;
                  break;
                }
            }
            }
             if(s.charAt(i)==('['))
            {
                for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(j)==(']'))
                {
                  count++;
                  break;
                }
            }
            }
        }
        System.out.println(count);
        if(count==s.length()/2)
        {
            return yes;
        }
        else
        {
            return no;
        }
        }
    }
}
public class leedcode20
{
    public static void main(String[] args) {
        String s="()";
        Solution so=new Solution();
        System.out.println(so.isValid(s)); 
    }
}