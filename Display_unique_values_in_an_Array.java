import java.util.*;
public class Solution2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(x[i]==x[j])
                    {
                        c+=1;
                    }
                }
            }
            if(c==0)
            {
                f=1;
                System.out.format("%d ",x[i]);
            }
        }
        if(f==0)
        {
            System.out.println(-1);
        }
    }
}