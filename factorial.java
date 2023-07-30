import java.util.Scanner;
public class factorial{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     int ans=1;
    System.out.println(solution(n,ans));
   
  }
  public static int solution(int n,int ans){
    
    if(n<=1)
    {
     return ans;
    }
    
    ans=ans*n;
    return solution(n-1,ans);
  
  }
}
