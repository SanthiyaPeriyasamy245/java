
public class Scoping {

  // variable inside a method only accessable by that method.
  // variable in the outside  can be accessable inside the any of the methods.
  // once you intialized the variable type  in the outside or in a method no need to intialize it again.
  static int x=5;
  public static void main(String[]a){
     int y=10;
      demo();
     {
       x=50; // no need to intialize the same variable again to change the value of a variable.
       y=90;
      
        System.out.println(y);
     }
    }
     static void demo()
     {
       // we can intialize same variable in different methods with same data type. 
      System.out.println(x);
      
     
     }
       
   
  }
  

