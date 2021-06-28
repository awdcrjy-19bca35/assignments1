
// java program to print the reverse of the given number // date: 28 june 2021



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse {

    public static void main(String[] args) {
            int rev=0,r,p;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter your number:");
         p=s.nextInt();       
         while(p>0)
        {
            r=p%10;
            rev=(rev*10)+r;
            p=p/10;
        }
        System.out.println("Reverse of input number: "+rev);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}


// output:
// Enter your number:
// 12345
// Reverse of input number: 54321

