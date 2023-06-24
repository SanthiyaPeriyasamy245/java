
import java.util.Scanner;
public class NestedSwitch {
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the rollno:");
    int rollno= sc.nextInt();
     System.out.print("enter the department (in capital letters):");
     String department=sc.next();
   
    switch(rollno)
    {
     
      case 1:
      System.out.println("rollno:1");
      switch(department)
      {
         case "EEE"->System.out.println("department:EEE");
         case "ECE"-> System.out.println("department:ECE");
         case "CSE"-> System.out.println("department:CSE");
         default->System.out.println("sorry! check your department name");
        
      }
      break;
      case 2:
      System.out.println("rollno:2");
      switch(department)
      {
         case "IT"->System.out.println("department:IT");
         case "AI"-> System.out.println("department:AI");
         case "MECH"-> System.out.println("department:MECH");
         default->System.out.println("sorry! check your department name");
        
      }
      break;
      default:
      System.out.println("invalid rollno! check your rollno.");
      
    }
  }
}
