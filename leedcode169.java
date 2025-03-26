class Solution {
    public int majorityElement(int[] nums) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++)
        {
            if(start==0)
            {
                end=nums[i];
            }
            if(end==nums[i])
            {
                start++;
            }
            else
            {
                start--;
            }
        }
        return end;
    }
}
class leedcode169{
    public static void main(String[] args)
    {
        Solution so=new Solution();
        int[] nums={3,3,4};
        System.out.println(so.majorityElement(nums));
    }
}