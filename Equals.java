import java.util.Scanner;
public class Equals{
  public static void main(String []args)
  {
    Scanner s=new Scanner(System.in);
    String animal=s.nextLine();
    if(animal.equals("tiger"))
    System.out.println("national animal");
   else  if(animal.equals("dog"))
    System.out.println("humans Friend");
    else if(animal.equals("cat"))
    System.out.println("kitty");
    else {
    System.out.println("invalid input");
    }
   switch(animal)
   {
    // switch can be written like this.
    case "lion"->System.out.println("king of the forest");
    case "rabbit"->System.out.println("cute");
    case "monkey"->  System.out.println("funniest");
    default->System.out.println("enter a validinput");
 

  
   }

  }
}