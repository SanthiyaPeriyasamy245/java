import java.util.Scanner;

public class Greatest{
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("enter any three numbers:");
     int n1=input.nextInt();
     int n2=input.nextInt();
     int n3=input.nextInt();
     int max=n3;
     if(n1>=max)
     {
      max=n1;
     }
     if(n2>=max)
     {
      max=n2;
     }
System.out.println(max);
max=Math.max(n3,Math.max(n1,n2));
System.out.println(max);
  }
}