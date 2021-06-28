// program to find out biggest of 4 numbers // date: 25 june 2021  
import java.io.*;
import java.util.*;   // import statements
public class Main
{
	public static void main(String[] args) {
	 int a,b,c,d,i,j,p;  // variable declaration
	 System.out.println("Enter 4 distinct numbers");
	 Scanner s = new Scanner(System.in);    // taking input using scanner
	 a=s.nextInt();
	  b=s.nextInt();
	   c=s.nextInt();
	    d=s.nextInt();
	    i=(a>b)?a:b;    // using ternary operator instead of if-else 
	    j=(c>d)?c:d;
	    p=(i>j)?i:j;
	    System.out.println("Biggest number is : "+p);
	}
}


// output:
// Enter 4 distinct numbers
// 9 5 1 3
// Biggest number is : 9
