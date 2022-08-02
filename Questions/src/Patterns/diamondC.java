package Patterns;

public class diamondC {
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j <= 2*i-1;j++)
            {
                if(j <= i)
                System.out.print(j);
                else
                System.out.print((2*i-1)-(j-1));
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--)
        {
            for(int j = 1;j <= 2*i-1;j++)
            {
                if(j <= i)
                System.out.print(j);
                else
                System.out.print((2*i-1)-(j-1));
            }
            System.out.println();
        }
    }
}

