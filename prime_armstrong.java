import java.util.Scanner;

public class prime_armstrong {
  public static void main(String []a)
  {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      String prime=isprime(n);
      System.out.println(prime);
      String armg=isarmstrong(m);
      System.out.println(armg);

  
  }
  // armstrong number.
 static String isarmstrong(int m) {
  int n1=m;
  int temp=m;
  int num=0;
  int count=0;
    while(m!=0)
    {
      int rem=m%10;
      count++;
      m/=10;
    }
    
    
    while(temp!=0)
    {
       int rem=temp%10;
        num=(int)(num+(Math.pow(rem,count)));
       temp/=10;
    }
    if(n1==num)
    return "it's anarmstrong number";
    else 
    return "it's not an amstrong number";
  }
  // prime number.
  static String isprime(int n){
  for(int i=2;i<n;i++){
       if(n%i==0)
       return "not prime";
  }
  return "prime";
}
}

