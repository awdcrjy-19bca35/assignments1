// program to print array elements in ascending order // date: 05 july 2021
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n,temp=0;
	    Scanner p=new Scanner(System.in);
	    System.out.println("Enter array size and elements:");
	    n=p.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=p.nextInt();
	    }
	     for(int i=0;i<n;i++)
	     {
	         for (int y=i+1;y<n;y++)
	         {
	             if(a[i]>a[y])
	             {
	                  temp=a[i];
                       a[i]=a[y];
                       a[y]=temp;
	             }
	         }
	     }
	    	System.out.println("Array elements in ascending order:");
	    for(int i=0;i<n;i++)
	    {
	        	System.out.print("   "+a[i]);
	    }
	
	}
}
/* output:
Enter array size and elements:

5

99

221

13

65

79

Array elements in ascending order:

   13   65   79   99   221

