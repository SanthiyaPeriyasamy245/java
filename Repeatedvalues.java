import java.util.Scanner;
public class Repeatedvalues {
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    System.out.print("enter a long digit number:");
   long n= input.nextLong();
   System.out.print("enter the value which need to be counted in a given number:");
   long n1=input.nextLong();
   Long count=0l;
   while(n!=0)
   {
    long remainder=n%10;
    if(remainder==n1)
    count++;
    n=n/10;
    
   }
   System.out.println(count);

  }
}
