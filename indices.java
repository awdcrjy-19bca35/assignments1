// java program to print sum of array elements between given indices // date: 06 july 2021
import java.util.*;
public class Indices
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
	    	System.out.println("Enter right and left indices:");
		int r=p.nextInt();
		int l=p.nextInt();
		if(n>0 && l<n && r<n && l<=r)
		for(int i=l;i<=r;i++)
		{
		  sum=sum+a[i];  
		}
		
		System.out.println("Sum is:"+sum);
	}
}
--------------------------------
/* output:
Enter array size:

6

Enter array elements:

1 2 3 8 7 6

Enter right and left indices:

5 2

Sum is:24







