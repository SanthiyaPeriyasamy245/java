public class crossword{
  public static void main(String[]args)
  {
    String s="program";
    int n=s.length();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++){
        
       if(i==j){
          System.out.print(s.charAt(j));
        }
        
        else if(j==n-i-1){
          System.out.print(s.charAt(n-i-1));
        }
        else
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
  }
}