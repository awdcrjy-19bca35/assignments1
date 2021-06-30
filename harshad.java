// program to check if given number is a HARSHAD number or not // date: 30 june 2021
import java.util.*;
public class Harshadnumber
{
	public static void main(String[] args) {
		int p,n;
		int sum=0,r=0;
		Scanner x=new Scanner(System.in);
		p=x.nextInt();
		 n=p;
		 while(p>0)
		 {
		     r=p%10;
		     sum=sum+r;
		     p/=10;
		 }
		 if(n%sum==0)
		 {
		     System.out.println("Harshad number");
		 }
		 else
		 {
		     System.out.println("Not Harshad number");
		 }
		
	}
}

//output:
// 12
// Harshad number



