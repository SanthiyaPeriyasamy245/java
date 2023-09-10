
class sample{
    private int num;
    int getnum() // getters
    {
      return num;
    }
    int getnum(int num) // getters
    {
      return num;
    }
    void setnum(int n)
    {
      this.num=n;
    }
}

public class accessmodifier{
  public static void main(String[] args) {
    // public if a method/variable is declared as public it can be accesesable from anywhere.
    //protected means it can be accessable except for different pkg & not subclass
    //no modifier it only accessable on it's own pkg and subclass of same pkg and class.
    // private only accessable on it's own class file.


    /* 1.private
    to access the private variable we can do it via methods 
    */
    sample se=new sample();
    System.out.println(se.getnum(100));// to get the value
    // to set a value
    se.setnum(120);//setters
    System.out.println(se.getnum());
    

  }
}
