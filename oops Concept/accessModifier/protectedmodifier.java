class base{
  protected int n=10;
}
class sample2 extends base{
  protected int  number=5;
}


public class protectedmodifier {
  public static void main(String[] args) {
    sample2 s2=new sample2();
    System.out.println(s2.n);
  }
}
