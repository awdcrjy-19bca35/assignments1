// java program to count number of words in the given sentence // date: 13 july 2021
import java.lang.*;
import java.util.*;
public class Main
{ public static void wordcount(String str) // method definition
  {
	String parts[]=str.split(" ");  
        int count=0;
         for(String i: parts)        
          {                            
            count++;  
          }
          System.out.println("Number of words in given sentence are: "+count);
  }
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your sentence:");
	String str=s.nextLine();
        wordcount(str);  // method call
	}
}
/*-------------------------------------------------------------------------------
output:
Enter your sentence:

this is a joke, right?

Number of words in given sentence are: 5
