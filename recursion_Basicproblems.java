public class recursion_Basicproblems{
    public static void main(String[]args)
    {
        int n=5;
        int m=1221;
        int k=300024;
       
        fun(n);
       System.out.println( fact(n));
       System.out.println( reverse(m));
       System.out.println( reverse2(m));
        System.out.println( palindrome(m));
        System.out.println( sumofdigits(m));
         System.out.println(countZeros(k,0));
    }
    public static boolean palindrome(int m)
    {
        return m==reverse2(m);
    }
    public  static int fact(int n)
    {
        if(n==2)
        {
            return 2;
        }
        return n*fact(n-1);
    }
    public static void fun(int n)
    {
        if(n<1)
        {
            return ;
        }
         
          System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static int sumofdigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sumofdigits(n/10);
    }
static int sum=0;
    public static int reverse(int n)
    {
      if(n==0)
      {
        return 0;
      }
      sum=sum*10+n%10;
      reverse(n/10);
      return sum;

    }
    public static int reverse2(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int x=(int)Math.log10(n);
        int rem=n%10;
        return (int)Math.pow(10,x)*rem+reverse2(n/10);
    }
    public static int countZeros(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
       if(n%10==0)
       {
        return countZeros(n/10,c+1); 
       }
       else
       {
        return countZeros(n/10,c);
       }

    }
}