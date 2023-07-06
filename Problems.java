import javax.sound.sampled.SourceDataLine;

public class Problems {
  public static void main(String[] args) {
    //  Q1.greatest of three numbers?
     int num1=12;
     int num2=256;
     int num3=1245;
     int max=num1;
     if(num2>max)
         max=num2;
     if(num3>max)
     max=num3;
     
     System.out.println(max);
      // we can use math function
      System.out.println(Math.max(num3,Math.max(num1,num2)));
        // Q2.chaxk whether the given letter is uppercase or lowercase?
        char letter='A';
        if(letter<='z'&&letter>='a')
        System.out.println("lowercase");
        else
        System.out.println("uppercase");

        // Q3.fibonacci of a number?
        int number=5;
        int i=2;
        int start=0;
        int next=1;
        while(i<=number)
        {
           int temp=next;
           next=next+start;
           start=temp;
         
           i++;

        }
        System.out.println(next);
        // Q3.count a particular value repeated in a given number
        int n=155555553;
        int k=5;
        int count=0;// to count how many times value 5 get repeated in a given number.
        while(n!=0)
        {
          if((n%10)==k)
          count++;
          n/=10;
        }
        System.out.println(count);
        // Q4.reverse of a number
        int rev=0;
        int n1=12345;
        while(n1!=0)
        {
          int rem=n1%10;
          rev=rev*10+rem;
          n1/=10;
        }
        System.out.println(rev);

        String fruit="apple";
        if(fruit.equals("apple"))
        System.out.println("redcolor fruit");
        else
        System.out.println("it's not a apple");
    }
   

}
