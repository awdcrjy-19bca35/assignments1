// program to replacea digit with another digit in a given number // date: 30 june 2021

import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
int n,r=0,m=1;
  Scanner w=new Scanner(System.in);
  n=w.nextInt();
  int g=w.nextInt();
  int h=w.nextInt();
while(n/10>0)
{
int q=n%10;
if(q==g)
{
r=r+h*m;
}
else 
{
r=r+q*m;  
}
m=m*10;
n=n/10;
}
if(n==g)
{
    r=r+h*m;
}
else
{
    r=r+n*m;
}

System.out.println(+r);
}
}

// output:
// 123455
// 5
// 6
// 123466
