// program to print numbers in given pattern // date: 02 july 2021
import java.util.*;
public class Main
{
	public static void main(String args[]) {
	 int n,i=0,j=0;
	 Scanner r=new Scanner(System.in);
	 n=r.nextInt();
	 int s=1;
	 int a[][]=new int[n][n];
	 int size=n*n;
	a[i][j]=s;	
      for(i=0;i<n-1;i++)
      { int c=0;
          for( j=i+1;j>=0;)
          {
              a[c][j]=++s;
		  c++;
		  j--;
	  }
      }
		a[n-1][n-1]=size;
		int d=n-2;
		for(i=1;i<=n-2;i++)
		{
			int c=n-1;
			for(j=d;j<=n-1;)
			{
			 a[c][j]=--size;
				c--;
				++j;
			}
                      --d;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print("  "+a[i][j]);
				System.out.println();
		}
	}
}
		
// output: 
/*
4

  1  2  4  7

  3  5  8  11

  6  9  12  14

  10  13  15  16




            
