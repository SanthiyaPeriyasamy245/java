
public class staticMethods {
  //inner class.
  //here the test class depends on the object of the staticmethods class if it's not static when we put it as static we are not depend object of static methods class.
 static  class test{
   String name;
    public test(String name)
    {
      this.name=name;
    }
  }
  public static void main(String[]args)
  {
  // non-static methods cannot be accessed from static method
  // To access non-static method from static method we have to create object with refference variables
    staticMethods sm=new staticMethods();
    System.out.println(sm.sqr1(4));
    // static methods can access another static method without creating any object
    System.out.println(sqr2(5));
    test ts=new test("java");
    System.out.println(ts.name);
  
}
public int sqr1(int n)
{
  return n*n;
}
public static int sqr2(int n)
{
  return n*n;
}
}

