// public means we can acces that class form anywhere?
/* static->when we want to execute a class without object creation we can use static method
that's why we are using static methid at starting point of the execution.*/
import java.util.Scanner;
public class Introduction {
  public static void main(String[] args) {
    // to get an input we have to use scanner class.
    // to use scanner class should import java.util.scanner;
    Scanner input=new Scanner(System.in);// when we get input from a keyboard(from user) use System.in.
    // int firstNumber=input.nextInt();
    // System.out.println(firstNumber);

    // type castin ans conversion.
    int value=257;
    float gpa=8.7f;
    double cost=123.4532;
    char letter='s';
    String name="Santhiya";
    long high_Value=1322435l;
    byte small_value=127;// you can store upto 127.
    // actually string is a class,string is immutable.
  //  String user_Input=input.next();
   System.out.println(input.nextLine());
   //it'll take the input as a word once whitespace found that's the end.
   // this is for strings with whitespaces (to take entire line).
     int number=small_value;//here you can store byte value in aninteger type  
     // always left side datatype should be greater than of right side.
     byte secondValue=(byte)value;
     int num='a'; // a letter can be stores in an element it will be converted to ascii value.
     // here we can't store int in a byte type variable so we convert the int value to byte .
    //  if the integer value more than the byte range it will do modulo operation
     System.out.println(secondValue);
    //  loops
    for(int i=0;i<5;i++) //for(intialization;condition;inc/dec)
    {
      System.out.println(i); // when you know the number of iteration use for loop otherwise while loop is best.
    }

   int i=0;
   while(i<5)
   {
    System.out.println(i);
    i++;
   }
  
   //  do-while used when you want to execute a statement only once eventhough the conbdition is not true. 
  int j=15;
   do{
 
  System.out.println(j);
}
while(j<5);

//conditonals
if(j>15)
System.out.println("it's greater than 15");
else
  System.out.println("it's not greater than 15");

  }
}
