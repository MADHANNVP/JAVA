import java.util.*;
public class Next_Permutation {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int size=s.nextInt();
        System.out.println("Enter Array value ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
           arr[i]=s.nextInt();
        }
        System.out.println("LeedCode Problem ");
        System.out.println("31. Next Permutation");
        Solution solu=new Solution();
        solu.nextPermutation(arr);
        System.out.print("[");
        for(int m:arr)
        {
            System.out.print(m+",");
        }
        System.out.print("]");
    }
}
class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(j>=0 && nums[j]<=nums[i])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp; 
    }
    public static void reverse(int[] nums,int start)
    {
     int end =nums.length-1;
     while(start<end)
     {
        swap(nums,start,end);
        start++;
        end--;
     }
    }
}
