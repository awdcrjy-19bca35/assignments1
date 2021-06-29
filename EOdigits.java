import java.io.*;
import java.util.*;
class Digits
{
public static void main(String args[])
{
int n,r,i=0,j=0;
  Scanner w=new Scanner(System.in);
  n=w.nextInt();
int a[]=new int[25];
int b[]=new int[25];
while(n>0)
{
r=n%10;
if(r%2==0)
{
a[i]=r;
i++;
}
else
{
b[j]=r;
j++;
}

n=n/10;
}System.out.println("Even digits:");
for(int k=0;k<i;k++)
{  
System.out.print(a[k]+" ");}
System.out.println();
System.out.println("Odd digits:");
for(int k=0;k<j;k++)
{System.out.print(b[k]+" ");}
}
}

//output:
//12345678

//Even digits:

//8 6 4 2 

//Odd digits:

//7 5 3 1 

