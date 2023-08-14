public class hcf{
  public static void main(String[]args)
  {
    int a=15,b=19;
   int m=Math.min(a,b);
  int n=Math.max(a,b);
  while(true){

  if(n%m==0)
  {
     System.out.println(m);
     break;
  }
  if(n%m==1)
  {
     System.out.println(1);
     break;
  }
      else
      {
         int j=n%m;
         n=m;
         m=j;
      }
  }
}
}