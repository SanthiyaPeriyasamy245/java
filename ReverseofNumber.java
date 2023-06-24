import java.util.Scanner;
public class ReverseofNumber {
  public static void main(String[]args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.print("enter a number:");
   long number=sc.nextLong();
   long temp=number;
   long rev=0l;
   while(number!=0)
   {
    long rem=number%10;
    rev=rev*10+rem;
    number/=10;
   }
System.out.println("GivenNumber: "+temp);
System.out.println("ReverseofGivenNumber: "+rev);

  }
  
}
