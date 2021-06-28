// java program to print even numbers within given range in reverse order // date: 28 june 2021


import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int i;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter range:");
	    i=s.nextInt();
	    for(int p=i;p>=0;p--)
	    { if(p%2==0)
	    {System.out.println(""+p);
	    }}
	    
	}
}

// output:
// Enter range:
// 10
// 10
// 8
// 6
// 4
// 2
// 0
