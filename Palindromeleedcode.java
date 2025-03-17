import java.util.*;
class Solution {
    public boolean isPalindrome(int x)
    {
        int a=x,rev=0,rem;
        while(x!=0)
        {
            rem=x%10;
            rev=(rev*10)+rem;
            x/=10;
        }
        return rev==a?5<6:5>6;
    }
}
public class Palindromeleedcode {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        Solution so=new Solution();
        System.out.println(so.isPalindrome(a));
    }
}
