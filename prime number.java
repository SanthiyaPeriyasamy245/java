class day2
{
    public static void main(String a[])
    {
        int n=30;
        int s=0;
        System.out.println("The prime numbers are:");
        for(int i=1;i<=n;i++)
        {
            s=0;
            for(int j=2;j<i;j++)
            {
             if(i%j==0)
             {
               s=s+1;
             }
        }
        if(s==0)
        {
            System.out.println(i);
        }
        }
    }
}