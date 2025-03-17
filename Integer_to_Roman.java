/* 12.Integer to Roman  */

import java.util.*;
class Solution {
    public String intToRoman(int num) {
    int[] x = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] z = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<x.length;i++)
    {
        while(num>=x[i])
        {
            sb.append(z[i]);
            num-=x[i];
        }
    }
    return sb.toString();
    }
}
class Integer_to_Roman{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        int num = s.nextInt();
        Solution so = new Solution();
        System.out.println(so.intToRoman(num));
    }
}