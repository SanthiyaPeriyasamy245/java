
// every class in java extends it's object class.


class s{
    public s()
    {
        System.out.println("s constructor");
    }
    public s(int n)
    {
        System.out.println(n);
    }

}
class a extends s{
    // super will be there if you are not mention it and it'll execute the superfirst.
   
    public a()
{
    super();//default.
    System.out.println("b constructor.");
}
public a(int n)
{ 
    
    this(); // this will execute the constructor of same class.
    System.out.println(n+" "+"hi");
}
}

// once we create the object it'll call the constructor of a class .

public class basic8 {


    
    public static void main(String a[])
    {
        a a1=new a(2);
      
    }
    
}
