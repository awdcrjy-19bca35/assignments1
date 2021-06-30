// program to print the difference of (product of digits in a number and the sum of the digits of the number) // date: 30 june 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int p;
		int sum=0,r=0;
		Scanner x=new Scanner(System.in);
		p=x.nextInt();
		 int pro=1;
		 while((p>0) && (p<=100000))
		 {
		     r=p%10;
		     sum=sum+r;
		     pro=pro*r;
		     p/=10;
		 }
		 int z=pro-sum;
		System.out.println(""+z);
		
	}
}

// output:
// 8691
// 408
