// java program to print the factorial of given number of test cases // date: 02 july 2021

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int t,n,i;
	    Scanner s=new Scanner(System.in);
	    t=s.nextInt();
	    while(t-- > 0)
	    { 
	        n=s.nextInt();
	     int res=1;
	     for(i=1;i<=n;i++)
	        {
	            res=res*i;
	        }
	       System.out.println(""+res);
	    }
		
	}
}
//output:
4

1

1

5

120

8

40320

2

2



