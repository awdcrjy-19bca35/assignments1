// program to check if the given year is a leap year // date: 26 june 2021



import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int year;
	     boolean leapy;
	    Scanner p = new Scanner(System.in);
		System.out.println("Enter year:");
		year=p.nextInt();
		if(year%4==0)   // year is divided by 4 
		{
		    if(year%100==0)  // checking if year is a century
		    {
		        if(year%400==0) // checking if the century is a leap year
		        leapy=true;
		        else
		        leapy=false;
		    }
		    else
		    leapy=true; // year is not a century but leap year
		}else 
		leapy=false;  // year is not divided by 4 so not a leap year
	if (leapy)	
	{System.out.println("Given year is a leap year.");}
	else 
		{System.out.println("Given year is not a leap year.");}
}
}

// output:
//Enter year:
//2000
//Given year is a leap year.
