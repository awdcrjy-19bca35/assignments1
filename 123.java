// java program to capitalise the first letter of each word in a string // date: 12 july 2021
import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter your string:");
	    String str=s.nextLine();
	    String parts[]=str.split(" ");  // using split method 
            String Str2 ="";               // taking new string 
        
            for(String i: parts)         // using for each loop - taking each word of the string
           {                            // using substring method to seperate the first letter
             Str2+=i.substring(0,1).toUpperCase()+i.substring(1)+ " ";  
           }
            System.out.println(Str2);
	}
}
/*---------------------------------------------------------------
output:
Enter your string:

olivia rodrigo sour

Olivia Rodrigo Sour 
