import java.util.Scanner;

public class Fibonacci {
  public static void main(String[]args)
  {
    //  fibonacci of 4 is  0,1,1,2,3.
    //   execution :n1=0 n2=1 n1=n2 temp=n1+n2 n2=temp.
    Scanner user_input=new Scanner(System.in);
    int n=user_input.nextInt();
    int n1=0;
    int n2=1;
    System.out.println(n1);
    System.out.println(n2);
    for(int i=2;i<=n;i++)
    {
      int temp=n1+n2;
      n1=n2;
      n2=temp;
    
    System.out.println(n2);
  
    }

  }
  
}
