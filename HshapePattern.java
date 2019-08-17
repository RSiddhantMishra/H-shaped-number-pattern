//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class HshapePattern
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=n,a=1,p=0,q=0;
        if(n%2==0)
        {
            p=n/2;
            q=n;
        }
        else
        {
            p=n/2+1;
            q=n+1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            if(i!=n-1)
            {
            for(int j=0;j<=q+1;j++)
            {
                System.out.print(" ");
            }
            }
            if(i==n-1)
            {
                a-=2;
                for(int j=0;j<=p;j++)
                {
                    System.out.print(a-- +" ");
                }
            }
            for(int j=0;j<=n;j++)
            {
                if(j==n)
                {
                    System.out.print(b);
                    b--;
                }
            }
            System.out.println();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                {
                    System.out.print(n-(i+1)+" ");
                }
            }
            if(i!=n-1)
            {
            for(int j=0;j<=q+1;j++)
            {
                System.out.print(" ");
            }
            }
            for(int j=0;j<n-1;j++)
            {
                if(j==n-2)
                {
                    System.out.print(a+i+1);
                }
            }
            System.out.println();
        }
    }
}
/* Input:(any number) eg:7
Output:
1           7
2           6
3           5
4           4
5           3
6           2
7 6 5 4 3 2 1
6           2
5           3
4           4
3           5
2           6
1           7
