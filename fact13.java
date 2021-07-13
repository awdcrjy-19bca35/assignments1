// java program to print factorialof given number using nested methods // date: 13 july 2021
import java.util.*;
public class Main
{ 
     public static void display(int n)  // display method
     	{
	      System.out.println("Factorial of given number is: ");
	      fact(n);          // method call for fact method
	    }
	     public static void fact(int n) // fact method
	    { int fact=1;
     	for(int i=1;i<=n;i++)  
    	{
	      fact=fact*i;
    	}
	    System.out.print(fact);
	    }
  public static void main(String[] args) {
	Scanner p=new Scanner (System.in);
	System.out.println("Enter the number:");
	int n=p.nextInt();
  display(n); // invoking display method (method call)
}
}
/*-------------------------------------------------------------------------------------
output:
Enter the number:

8

Factorial of given number is: 

40320

