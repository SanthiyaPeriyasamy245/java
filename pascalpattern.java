public class pascalpattern
{
  /*
    1 
    1 1 
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    */
  public static void main(String[]args)
  {
    int n=6;
    for(int i=0;i<n;i++)
    {
      int num=1;
      for(int j=0;j<=i;j++)
      {
        System.out.print(" "+num+" ");
        num=num*(i-j)/(j+1);
      }
      System.out.println();
    }
  }
}