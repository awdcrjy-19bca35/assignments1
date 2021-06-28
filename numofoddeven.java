import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n,even=0,odd=0,r;
		Scanner y = new Scanner(System.in);
		System.out.println("Enter the number:");
		n=y.nextInt();
		while(n>0)
		{   r=n%10;
		if(r%2==0)
		{
		    even++;
		}
		else
    {
		    odd++;
		}
		    n=n/10;
		}
		System.out.println("Odd Digits:"+odd+",Even Digits:"+even);
	}
}

//output:
// Enter the number:
// 223344
// Odd Digits:2,Even Digits:4
