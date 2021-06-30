//program to display the difference of the product and sum of the digits in a given number // date: 30 june 2021 //leet code program

import java.io.*;
class Solution {
    public int subtractProductAndSum(int n) {
        
		int sum=0,r=0;
		int pro=1;
		 while((n>0) && (n<=100000))
		 {
		     r=n%10;
		     sum=sum+r;
		     pro=pro*r;
		     n/=10;
		 }
        int z=pro-sum;
          System.out.println(+z+"");
        return z;
      
        
    }
}
public class Main
{
public static void main (String[] args) 
    {
       Solution q = new Solution();
       q.subtractProductAndSum(155);
    }
}

//output:
// 14
