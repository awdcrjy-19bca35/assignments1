// java program to print the given pattern 3 // date: 01 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,k=1;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    char ch='A';
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {System.out.print(ch++);}
	        System.out.println();
	       
	    }
	}
}
// output:
5

A

BC

DEF

GHIJ

KLMNO
