import java.util.Scanner;

public class Loops {
    public static void main(String []args)
    {
      System.out.print("N:");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int fact=1;
        int i=1;
        while(i<=5)
        {
            System.out.println(i);
            i++;
        }
        for(i=1;i<=N;i++)
        {
            fact=fact*i;
        }
     System.out.println(fact);
    
    int fibo=0;
    int n1=0;
    int n2=1;
// fibonacci series.
    for(int j=0;j<N;j++)
    {
        
        fibo=n1+n2;  
        n2=n1;
        n1=fibo;
        System.out.println(fibo);
        
    }
       System.out.println(fibo);
}
}
