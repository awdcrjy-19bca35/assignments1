// program to print numbers in given pattern // date: 02 july 2021

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 int i,j,k,l; 
	 int t,count=1;
	 int a[][]=new int[10][10];
	 Scanner s=new Scanner(System.in);
	 t=s.nextInt();
	 while(t-- >0)
	 { int n=s.nextInt();
      for(i=1;i<=n;i++)
      {
          for(j=1;j<=n;j++)
          {
              if (a[i][j]==0)
              {
                while(j>=1 && i<=a.length)
              {
                  a[i][j]=count;
                  count++;
                  i++;
                  j--;
                }
              }
          }
      }
   }
    
  }
}
// output: --            
            
