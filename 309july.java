// java program to sort each row of matrix // date: 09 july 2021
import java.util.*;
public class Main
{  
	public static void main(String[] args) {
	    Scanner p=new Scanner(System.in);
		System.out.println("Enter matrix row,column values");
		int r=p.nextInt();
		int c=p.nextInt();
		int i,j;
		int a[][]=new int[r][c];
		System.out.println("Enter array elements");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<c;j++)
		    {
		        a[i][j]=p.nextInt();
		    }
		}
		int temp;
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		        for(int k=j+1;k<c;k++)
		        {
		            if(a[i][j]>a[i][k])
		            {
		                temp=a[i][j];
		                a[i][j]=a[i][k];
		                a[i][k]=temp;
		            }
		        }
		    }
		}
		System.out.println("Result:");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<c;j++)
		    {
		       System.out.print(" "+a[i][j]);
		    }
		    System.out.println();
		}
	
	}
}
/*----------------------------------------------------------
output:
Enter matrix row,column values

3

4

Enter array elements

5 4 3 2

4 3 2 1

9 8 7 6

Result:

 2 3 4 5

 1 2 3 4

 6 7 8 9



