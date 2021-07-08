// java program to print the sum of each column in the matrix // date: 08 july 2021
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
	    for(int i=0;i<c;i++)
		{	int sum=0;
		    for(int j=0;j<r;j++)
		    {
		        sum=sum+a[j][i];
		    }
		    System.out.println("Column "+(i+1)+" sum :"+sum);
		}
	}
}

/* output:
Enter array row, column values

3

4

10 12 20 13

18 19 40 26

11 13 14 15

Column 1 sum :39

Column 2 sum :44

Column 3 sum :74

Column 4 sum :54



