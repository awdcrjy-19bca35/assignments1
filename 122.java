// java program to sort a given string in lexicographic order // date: 12 july 2021
import java.lang.*;
import java.util.*;
class Main
{ 
    public static void Sortasc(String str) 
    { 
        char [] in= str.toCharArray();
        Arrays.sort(in);
        String Answer="";
        for(int i=0;i<in.length;i++)
        {
         Answer+=in[i];
        }
         System.out.println("After sorting: ");
         System.out.print(Answer);
         
    }
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String st=sc.nextLine();
        Main obj=new Main();
        obj.Sortasc(st);
    }
}
/*_____________________________________________________________________________________
output:
Enter your string

mycustominput

After sorting: 

cimmnopsttuuy


-----------------------------
output 2:
Enter your string

online java compiler gdb

After sorting: 

   aabcdeegiijllmnnooprv

