// java program to print the given square pattern // date: 03 july 2021 
import java.util.*;
class Pattern
{
public static void main(String args[])
{
int n,start=0,end;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
char ch='A';
int s=(n*2)-1;
end=s-1;
char a[][]=new char[s][s];

while(n>0)
{
for(int i=start;i<=end;i++)
{
for(int j=start;j<=end;j++)
{
if(i==start||i==end||j==start||j==end)
a[i][j]=ch;
}
}
++start;
--end;
++ch;
--n;
}
for(int i=0;i<s;i++)
{
for(int j=0;j<s;j++) 
System.out.print(a[i][j]);
System.out.println();
}
}
}
/* output:
7
AAAAAAAAAAAAA
ABBBBBBBBBBBA
ABCCCCCCCCCBA
ABCDDDDDDDCBA
ABCDEEEEEDCBA
ABCDEFFFEDCBA
ABCDEFGFEDCBA
ABCDEFFFEDCBA
ABCDEEEEEDCBA
ABCDDDDDDDCBA
ABCCCCCCCCCBA
ABBBBBBBBBBBA
AAAAAAAAAAAAA
*/


