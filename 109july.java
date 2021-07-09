// java program to print the difference of diagonal and anti diagonal of matrix // date: 09 july 2021
import java.util.*;
public class Main
{  
	public static void main(String[] args) {
	    Scanner p=new Scanner(System.in);
		System.out.println("Enter square matrix size");
		int r=p.nextInt();
		int i,j;
		int a[][]=new int[r][r];
		System.out.println("Enter array elements");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        a[i][j]=p.nextInt();
		    }
		}
		int sum=0;                                                             // simple method: int sum=0,sum1=0;
		for( i=0;i<r;i++)                                                      // for( i=0;i<r;i++)    
		{                                                                      // {for( j=0;j<r;j++)
		    for( j=0;j<r;j++)                                                  // {if(i==j)
		    {                                                                  // {sum+=a[i][j];}
		        if(i==j)                                                       //  if(i+j==r-1)
		        {sum+=a[i][j];}                                                // {sum1+=a[i][j];}}}
		    }
		}
		int sum1=0;
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        if(i+j==r-1)
		        {sum1+=a[i][j];}
		    }
		}
		System.out.println("Difference of diagonal and anti diagonal of given matrix is:");
		System.out.println(sum-sum1);
	}
}
/*----------------------------------------------------
output:
Enter square matrix size

3

Enter array elements

1 2 3

11 12 13

22 33 44

Difference of diagonal and anti diagonal of given matrix is:

20



