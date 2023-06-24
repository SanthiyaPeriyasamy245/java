import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Calculator {
  
public static void main(String[]args)
{
  Scanner num=new Scanner(System.in);
  System.out.println("enter anyone operator (+,-,*,/,%):");
  char op=num.next().trim().charAt(0);
  if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') // in  swtich you can directly apply this condition.
  {
    System.out.println("Enter two values");
    int n1=num.nextInt();
    int n2=num.nextInt();
    // if lese statements can be used here
    switch(op)
    {
      case '+':
      System.out.print("sum="+(n1+n2));
      break;
       case '-':
      System.out.print("difference="+(n1-n2));
      break;
       case '*':
      System.out.print("product="+(n1*n2));
      break;
       case '/':
      System.out.print("division="+(n1/n2));
      break;
       case '%':
      System.out.print("remainder="+(n1%n2));
      break;
    }
    
  }
  else{
      System.out.println("invalid input");
    }
}

}
