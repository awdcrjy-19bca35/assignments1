import java.util.*;

public class Main{
    public static void main (String[] args) {
        int n,start=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int size=n*2-1;
        int end=size-1;
        int a[][]=new int[size][size];
        while(n!=0)
        {
            for(int i=start;i<=end;i++)
            {
                for(int j=start;j<=end;j++)
                {
                    if(i==start || i==end || j==start || j==end)
                    a[i][j]=n;
                }
            }
            start++;
            end--;
            n--;
        }
        for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {System.out.print(" "+a[i][j]);}
                System.out.println();
            }


}
    
}
/*
6

 6 6 6 6 6 6 6 6 6 6 6

 6 5 5 5 5 5 5 5 5 5 6

 6 5 4 4 4 4 4 4 4 5 6

 6 5 4 3 3 3 3 3 4 5 6

 6 5 4 3 2 2 2 3 4 5 6

 6 5 4 3 2 1 2 3 4 5 6

 6 5 4 3 2 2 2 3 4 5 6

 6 5 4 3 3 3 3 3 4 5 6

 6 5 4 4 4 4 4 4 4 5 6

 6 5 5 5 5 5 5 5 5 5 6

 6 6 6 6 6 6 6 6 6 6 6



