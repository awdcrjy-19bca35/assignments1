// java program to print even numbers within given range in reverse order // date: 28 june 2021


import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {                                    
	    int l,u;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter range lower and upper bounds:");
	    l=s.nextInt();
		u=s.nextInt();  
		while(l!=u)
		{
	    for(int k=u;k>=l;k--)
	    { if(k%2==0)
	    {
	        System.out.println(k+"");
	        
	    }
	    }
			break;
	    }
	    }
}

// output:
// Enter range lower and upper bounds:
// 0
// 20
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2
// 0
