import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list = new ArrayList();
        for(int i=0 ; i<numRows ;i++)
        {
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> prev=list.get(i-1);
                    row.add(prev.get(j)+prev.get(j-1));
                }
            }
            list.add(row);
            }
            return list;
        }
    }
class leedcode118
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        Solution solu=new Solution();
        solu.generate(a);
    }
}