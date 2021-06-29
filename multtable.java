// java program to print the multiplication table of given number // date: 29 june 2021

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number:");
	n=s.nextInt();
	for(int i=1;i<11;i++)
	{
	    System.out.println(""+n+"x"+i+"="+(n*i));
	}
	}
}

// output:
//Enter number:

//8

//8x1=8

//8x2=16

//8x3=24

//8x4=32

//8x5=40

//8x6=48

//8x7=56

//8x8=64

//8x9=72

//8x10=80



