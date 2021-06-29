import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Reverse {
         public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());
         int r;
             long rev=0;
                   
         if(p>0)
         {while(p>0)
        {
            r=p%10;
            rev=(rev*10)+r;
            p=p/10;
        }
        System.out.println(""+rev);}
             else
             {
         while(p<0)
        {
            r=p%10;
            rev=(rev*10)+r;
            p=p/10;
        }
        System.out.println(""+rev);}
             } 
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
// output:
// 6789
// 9876

// output 2:
// -123
// -321
