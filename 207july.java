// program to print the majority element in the array // date: 07 july 2021
import java.util.*;
class Mainmajorele
{
	public static void main(String args[])
	{
	System.out.println("Enter array size and elements:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int c=1,c1=0,m=0;
	int n1=n;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;)         
		{  
			if(a[i]==a[j])
			{        
                                c++;
				for(int k=j;k<n-1;k++)
				{
				a[k]=a[k+1];
				}
				n--;
			}
                      if(a[j]==a[i])
                      j=j;
                      else
                      j++;
		}
		if(c>n1/2)
		{
		c1=c;
		m=i;
		break;
		}
                c=1;
		
	}
	if(c1==0)
	System.out.println("No majority element");
	else
        System.out.println(a[m]+" is the majority element");
	}
}
/* ----------------------------------
Enter array size and elements:

4

5 8 9 10

No majority element



