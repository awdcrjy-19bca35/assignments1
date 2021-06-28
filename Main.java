/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

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