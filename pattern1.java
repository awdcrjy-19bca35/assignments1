// java program to print given pattern // date: 01 july 2021

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(int i=n;i>=1;i--)
	    {
	        for(int j=1;j<=i;j++)
	        {
	          System.out.print("*");  
	        }
	        
	        	System.out.println();
	      
	    }  
	
	}
}

//output:
5

*****

****

***

**

*
