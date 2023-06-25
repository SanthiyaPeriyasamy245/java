public class Arms {
  
  public static void main(String []a)
   {
     
      for(int i=1000;i<10000;i++){
      isarmstrong(i);
      }

    
    

  
  }
  // armstrong number.
 static void isarmstrong(int m) {
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
    System.out.println(n1);
  }
  
}

