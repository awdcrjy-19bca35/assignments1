
// java program to print the reverse of the given number // date: 28 june 2021
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());
int r,rev=0;
        bufferedReader.close();
            while(p>0)
        {
            r=p%10;
            rev=(rev*10)+r;
            p=p/10;
        }
          System.out.println(" "+rev);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

// output:
// Enter your number:
// 12345
// Reverse of input number: 54321

