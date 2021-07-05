// program to print sum of array elements // date: 05 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,sum=0;
	    Scanner p=new Scanner(System.in);
	    System.out.println("Enter array size and elements:");
	    n=p.nextInt();
	    int a[]= new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=p.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	        sum+=a[i];
	    }
		System.out.println("Sum of array elements:"+sum);
	}
}
/* output:
Enter array size and elements:

5

1

2

3

4

5

Sum of array elements:15



