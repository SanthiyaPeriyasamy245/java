import java.util.ArrayList;
public class factors{
  public static void main(String[]args)
  {
    int n=20;
    factor(n);
  }
  public static void factor(int n)
  {
    ArrayList<Integer>list=new ArrayList<>();
    for(int i=1;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      {
        if(n/i==i)
        {
          System.out.print(" "+i+" ");
        }
        else{
          System.out.print(i+" ");
          list.add(n/i);
        }
      }
      

    }
    for(int k=list.size()-1;k>=0;k--)
          {
            System.out.print(" "+ list.get(k));
          }
  }
}