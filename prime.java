public class prime {
  public static void main(String[]args)
  {
  int n=100;
 
  for(int i=10;i<=n;i++)
  { 
    int count=0;
    for(int j=2;j<i;j++)
    {
      if(i%j==0)    
         count++;     
    }
    if(count==0)
    System.out.println(i);

  }
}
  }

