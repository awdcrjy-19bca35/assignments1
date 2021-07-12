// java program to sort given string in descending order // date: 12 july 2021
import java.lang.*;
import java.util.*;
class Descend
{ 
    public static void Sortdesc(String str) 
    { 
        char [] in= str.toCharArray();  //converting the taken input string to character array
        Arrays.sort(in);                // sorting the character array using sort method
        String Answer="";               // inserting the sorted character array into a new string
        for(int i=in.length-1;i>=0;i--)
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
        Descend obj=new Descend();     // creating object to access the method 
        obj.Sortdesc(st);
       
    }
}
/*-------------------------------------------------------
output:
Enter your string

geeksforgeeks

After sorting: 

ssrokkggfeeee

output2:------------------------------------------------
Enter your string

gayathrisowjanya

After sorting: 

yywtsronjihgaaaa

