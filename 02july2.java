// program to obtain a number N and increment its value by 1 if 
//the number is divisible by 4 otherwise decrement its value by 1.  // date: 02 july 2021
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,k;
	    Scanner p=new Scanner(System.in);
	    n=p.nextInt();
	    if(0<=n)
	    {
	        if(n<=1000)
	        {
	           k=(n%4==0)?++n:--n;
	           System.out.println(k); 
	        }
	    }
	}
}
// output:
//0

//1



