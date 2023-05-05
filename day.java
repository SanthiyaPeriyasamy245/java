
    
public class day {
    public static void main(String a[])
    {
  int c[][]=new int[3][4];
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<4;j++){
        c[i][j]=(int)(Math.random()*10);

    }
  }
  for(int x[]:c)
  {
    for(int h:x)
    {
        System.out.print(h+" ");
    }
    System.out.println();
  }
  int d[]=new int[5];
  for(int i=0;i<5;i++)
  {
    d[i]=(int)(Math.random()*10);
  }
// enhanced for loop.
  for(int f:d)
  
  {
    System.out.print(f+" ");
    
  }

    }
}

