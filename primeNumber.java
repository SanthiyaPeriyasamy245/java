public class primeNumber{
  public static void main(String[]args){
    int n=11;
    int i=2;
    int c=0;
    while(i*i<=n){
      if(n%i==0)
      {
        c++;
        break;
      }
      i++;
    }
    if(c==0){
      System.out.println("prime");
    }
    else{
      System.out.println("not a prime");
    }
    
  }
}