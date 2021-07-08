import java.util.*;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size and elements");
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	int c=0;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;)
		{  int q=0;
			if(a[i]==a[j])
			{    q=j;    
                                c++;
				for(int k=j;k<n-1;k++)
				{
				a[k]=a[k+1];
				}
				n--;
			}
                      if(a[j]==a[i])
                      j=q;
                      else
                      j++;
		}
	
		if(c==0)
		System.out.print("Non repeated number:"+a[i]+" ");        
		c=0;
	}
	}
}
/*------------------------------------------
Enter array size and elements

5

889 89 8 89 889

Non repeated number:8 

