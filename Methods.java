public class Methods {
  static int num=123;// static variable can be accessable whole in the class.
  public static void main(String[] args) {
    int n1=12;
    int n2=13;
    int result=sum(n1,n2);
    System.out.println(result);
    // to pass a static methods variable to the other methods that method should be static static variable can be used in non-static method but non-static variable can't be used in static methods.
    {
      num=62;
      System.out.println(num);
      int c=10;
      System.out.println(c);// if a variable intialised inside a block it's not accessable outside the box.but we can change the value of a variable which is declared outside the block.
      // no need to reintialize the type of an variable inside a block.
     n1=34;
    }
    System.out.println(num);
    int n=371;
    System.out.println(isprime(n));  
    for(int i=1;i<=n;i++)
    {
       if(isprime(i))
       System.out.println(i);
    }
      System.out.println(isarmstrong(n)); 
      for(int i=100;i<=999;i++)
      {
          if(isarmstrong(i))
          System.out.println(i);
      }
    

  }
  public static int sum(int v1,int v2)
  {

    return v1+v2;
  }
   public static int sum(int v1,int v2,int v3) 
  //  it's not a problem if you have methods more than one method with same name parameters are really matters! this called method overloading.
  {
    return v1+v2;
  }

  public static boolean isprime(int n)
  {
    int i=2;
    while(i*i<=n)
    {  
      if(n%i==0)
      return false;
     i++;
    }
   return true;
  }
  public static boolean isarmstrong(int n)
  {
    int v=n;
    int k=n;
    int i=0;
    while(n!=0)
    {
      i++;
      n/=10;
    }
    int sum=0;
    while(v!=0)
    {
      int rem=v%10;
      sum=(int)(sum+Math.pow(rem,i));
      v/=10;
    }
   return sum==k;
  
  }
 
}
