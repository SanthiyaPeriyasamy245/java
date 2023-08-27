public class MagicNumber{
  public static void main(String[]args)
  {
    int m=5;
    int sum=0;
    int pow=1;
 
    while(m!=0)
    {
      pow=pow*5;
      if((m&1)==1)
      {
        sum=sum+pow;
      }
      m=m>>1;
    }
    System.out.println(sum);
  }
}