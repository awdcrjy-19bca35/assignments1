// java program to swap 2d matrices // date: 09 july 2021
import java.util.*;
public class Swap
{  static void arrswap(int arr[][],int ar[][])
        {
          for(int i=0;i<arr.length;i++)
	    	{
		     for(int j=0;j<arr.length;j++)
		     {
		        arr[i][j]=ar[i][j];
		     }
	    	} 
        }
	public static void main(String[] args) {
	    Scanner p=new Scanner(System.in);
		System.out.println("Enter square matrix size");
		int r=p.nextInt();
		int i,j;
		int a[][]=new int[r][r];
		int b[][]=new int[r][r];
		int c[][]=new int[r][r];
		System.out.println("Enter array1 elements");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        a[i][j]=p.nextInt();
		    }
		}
		System.out.println("Enter array2 elements");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        b[i][j]=p.nextInt();
		    }
		}
	     
		arrswap(c,a);
		arrswap(a,b);
		arrswap(b,c);
		System.out.println("After Swap:");
		System.out.println("Matrix 1:");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        System.out.print(" "+a[i][j]);
		    }
		    System.out.println();
		}
		System.out.println("Matrix 2:");
		for( i=0;i<r;i++)
		{
		    for( j=0;j<r;j++)
		    {
		        System.out.print(" "+b[i][j]);
		    }
		    System.out.println();
		}
	}
}
/*--------------------------
output:
Enter square matrix size

4

Enter array1 elements

1 2 3 4

5 6 7 8

11 12 13 14

15 16 17 18

Enter array2 elements

0 1 2 4

9 6 7 8

2 3 4 5 

8 2 3 4

After Swap:

Matrix 1:

 0 1 2 4

 9 6 7 8

 2 3 4 5

 8 2 3 4

Matrix 2:

 1 2 3 4

 5 6 7 8

 11 12 13 14

 15 16 17 18



