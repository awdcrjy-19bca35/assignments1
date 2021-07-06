// java program to find the running sum of array elements // date: 06 july 2021
import java.util.*;
public class Runsum
{
	public static void main(String[] args) {
	    Scanner p=new Scanner(System.in);
	    System.out.println("Enter array size:");
	    int n=p.nextInt();
	    int sum=0;
	    int a[]=new int[n];
	    System.out.println("Enter array elements:");
	    for(int i=0;i<n;i++)
	    {
	        a[i]=p.nextInt();
	    }
	    
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<=i;j++)
	       	{
		     sum=sum+a[j]; 
		    }
		
		}
		
		System.out.println("Running Sum is:"+sum);
	}
}
-----------------------------------------------------
  /* output:
Enter array size:

3

Enter array elements:

7

90

125

Running Sum is:326



