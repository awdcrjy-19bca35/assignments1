//program to print prime numbers in the array // date: 07 july 2021
import java.util.*;
class MainPrime
{
	public static void main(String args[])
	{
	    System.out.println("Enter array size and elements");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int c=0,c1=0;
        for(int i=0;i<n;i++)
	{
		if(a[i]>1)
		{
		 c=0;
		for(int j=2;j<=a[i]/2;j++)
		{
		if(a[i]%j==0)
		{
        	c=-1;
		c1++;
		break;
		}
		}
		if(c==0)
        	System.out.print(a[i]+" ");
		
		}
		else
		c1++;
	}
if(c1==n)
System.out.println("there are no prime numbers");
	}
}
/*---------------------------
Enter array size and elements

8

1 2 3 4 5 7 11 13

2 3 5 7 11 13 

