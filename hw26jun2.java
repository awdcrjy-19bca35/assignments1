import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] code) {
	 char input;
	 System.out.println("Enter a letter");
	 Scanner s = new Scanner(System.in);
	 input = s.next().charAt(0);
	 switch(input)
	 {
	     case 'a':
	      case 'A': 
	       case 'e':
	         case 'E':
	           case 'i':
	          case 'I':
	         case 'o':
	       case 'O':
	     case 'u':
	    case 'U': System.out.println("Input letter is vowel");
	                                         break;
	                                        
	                                         default: System.out.println("Consonant");
     
	 }
	}
}
