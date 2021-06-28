// program to swap 2 numbers // date: 26 june 2021

import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   int a=25,b=16;
	   System.out.println(" Before swapping a = "+a+", b = " +b);
	  a=a+b;
	  b=a-b;
	  a=a-b;
	   System.out.println(" After swapping a = "+a+", b = " +b);
}
}

//output:
//Before swapping a = 25,  b = 16
//After swapping a = 16,  b = 25
