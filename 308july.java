// java program to print the transpose matrix of given matrix // date: 08 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner p=new Scanner(System.in);
		System.out.println("Enter array row, column values");
		int r=p.nextInt();
		int c=p.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=p.nextInt();
		    }
		}
	  System.out.println("Transposed Matrix:");
		for(int i=0;i<c;i++)
		{
		    for(int j=0;j<r;j++)
		    {
		       System.out.print(" "+(a[j][i]));
		    }
		    System.out.println();
		}
	}
}
/*--------------------------
output:
Enter array row, column values

3

4

11 12 13 14

22 23 24 25

33 34 35 36

Transposed Matrix:

 11 22 33

 12 23 34

 13 24 35

 14 25 36



