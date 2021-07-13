// java program to print prime numbers within 1 and given range // date: 13 july 2021
import java.util.*;
public class Main
{   public static void primeNos(int n)  // method definition
	{ 
	 for(int i=1;i<=n;i++)
	 {
	     int c=0;
	     for(int j=1;j<i;j++)
	     {
	         if(i%j==0)
	         c++;
	     }
	     if(c==1)
	     System.out.print(" "+i);
	 }
	} 
	public static void main(String[] args) {
	Scanner p=new Scanner (System.in);
	System.out.println("Enter n value:");
	int n=p.nextInt();
	primeNos(n);  // method invoking
	}
}
/* -----------------------------------------------------------
output:
Enter n value:

35

 2 3 5 7 11 13 17 19 23 29 31

