// java program to remove the duplicate elements in an array // date: 06 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner p=new Scanner(System.in);
	    System.out.println("Enter array size and elements:");
	    int n=p.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=p.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=i+1;j<n-1;j++)
	        {
	            if(a[i]==a[j])
	            {
	              a[j]=a[n-1];
                      n--;
	            }
	        }
	   }
	   for(int i=0;i<n;i++)
	   System.out.print("  "+a[i]);
	  
	}
}
-----------------------------------------------------------------
  /* output:
 Enter array size and elements:

4

1 2 1 3

  1  2  3



