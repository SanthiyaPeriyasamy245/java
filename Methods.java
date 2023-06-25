import java.util.Arrays;
import java.util.Scanner;

public class Methods{
  public static void main(String[]args)
  {
   
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("enter your name");
    String name= sc.next();
    change_name(name);// name not gonna change.
    System.out.println(name);
     welcome(); 
     int sum=sum( a ,b);
     System.out.println(sum);
     swap(a,b);// it won't work. // in java there is only pass by value no pass by referrence.
     System.out.println(a+" "+b);
    int[]d={1,2,3,4,5,6,7,8};
    new_array(d); // change a particular element in an array can be done by methods.
    System.out.println(Arrays.toString(d));
     
  }
  static void welcome() {
    
      System.out.println("Hello User!");
  }
  static int sum(int n,int m)
  {
    return n+m;
  }
   static void swap(int a,int b) // it doesn't change the value
  {  
   int t=a;
   b=a;
   a=b;
     
   
  }
  static void change_name(String name)
  {
    name="Sandhya";  // here we are creating new object we didn't change the value of name.
  }
  static void new_array(int[]arr)
  {
    arr[1]=99;
  }
  
}
