
  
//array.

class day1{
    public static void main(String a[])
    { 
     int gpa[]={7,8,7,89,98,85,78,74};   
     for(int i=0;i<=7;i++)
     {
      System.out.println(gpa[i]);
     }
     
      int num1[]=new int[5];//dynamic array;
      num1[0]=12;
      num1[1]=23;
      num1[2]=34;
      num1[3]=45;
      System.out.println("elements of num1 array are:");
      for(int i=0;i<=3;i++)
      {
        System.out.println(num1[i]);
      }
    //multi dimensional array.
      int vals[][]=new int[4][3];
      for(int i=0;i<=3;i++)
      {
        for(int j=0;j<=2;j++)               
        {                                 
          System.out.print(vals[i][j]);
        }
        System .out.println();
      }
    }
  }
