
class addition{
 private int Number=100;
  // if a variable declared as a private it is only accessable on it's own class.
 private int number; 
 // to access the private data you need call them via methods to get a value use get method to set a value use set methods.
 int getNumber()
 {
  return Number;
 }
 void setnumber(int n)
 {
  number=n;
  
 }
 int getnumber()
 {
  return number;
 }

}


public class encapsulation {

public static void main(String[] args) {
  addition en=new addition();
  System.out.println(en.getNumber());
  en.setnumber(99);
    System.out.println(en.getnumber());
}

}
