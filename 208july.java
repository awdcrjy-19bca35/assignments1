// java program to print the largest element in each column of matrix // date: 08 july 2021
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
		int large;
	        for(int i=0;i<r;i++)
		{ large=a[0][i];
		    for(int j=0;j<c;j++)
		    { 
		        if(large<a[j][i])
		        {large=a[j][i];}
		    }
		    System.out.println("largest element in column "+(i+1)+" is: "+large);
		}
	}
}
/* ------------------------------------------------
 output:
Enter array row, column values

3

3

3 5 9 

7 8 1

10 34 21

largest element in column 1 is: 10

largest element in column 2 is: 34

largest element in column 3 is: 21



