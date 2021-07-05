// program to print the second largest number in the array // date: 05 july 2021
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
	    	System.out.println("Second largest number is:");
	    System.out.print("   "+a[n-2]);
	}
}
/* output:
Enter array size and elements:

5

23

33

1

2

3

Second largest number is:

   23

