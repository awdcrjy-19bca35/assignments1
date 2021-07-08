// program to print the majority element in the array // date: 07 july 2021
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter array size and elements:");
	    n=s.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=s.nextInt();
	    }
	    int c=1,c1=0,t=0;
	    int nn=n;
	     for(int i=0;i<n;i++)
	     {
	         for(int j=i+1;j<n;)
	         {
	             int p=0;
	             if(a[i]==a[j])
	             {
	                 p=j;
	                 c++;
	                 for(int k=j;k<n-1;k++)
	                 {
	                     a[k]=a[k+1];
	                 }
	                 n--;
	             }
	            if (a[j]==a[i])
	            j=p;
	            else
	            j++;
	         }
	         if(c>nn/2)
	         {
	            c1=c;
	            t=i;
	            break;
	         }
	         c=1;
	     }
	     if(c1==0)
	         System.out.println("No majority element");
	     else
	     {
	     System.out.println("Majority element:"+a[t]);
	     }
	}
}
/* ----------------------------------
Enter array size and elements:

4

5 8 9 10

No majority element



