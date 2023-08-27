// nth row sum.
public class PascalSum{
  public  static void main(String[]args)
  {
    /*
    concept each row sum=2^n-1;
    1 
    1 1 
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    */
    int n=5;
    System.out.println((int)Math.pow(2,n-1));
     System.out.println(1<<(n-1));
  }
}
