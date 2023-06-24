import java.util.Scanner;

public class Casetesting {
  public static void main(String[]args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("enter a letter");
    char letter=input.next().trim().charAt(0);
    if(letter>='a'&&letter<='z')
    System.out.println("It's lowercase");
    else
    System.out.println("it's uppercase");


  }
}
