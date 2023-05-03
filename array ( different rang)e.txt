
  
//array.

class day1{
    public static void main(String a[])
    { 
     
    //multi dimensional array.
      int vals[][]=new int[3][];
      // jagged array(when we don't know the size).
      vals[0]=new int [3];
      vals[1]=new int[4];
      vals[2]=new int[5];

     for(int i=0;i<vals.length;i++)
     {
      for(int j=0;j<vals[i].length;j++)
      {
        vals[i][j]=(int)(Math.random()*100);
      }
     }
        // enhanced for loop.
     for(int g[]:vals)
     {
      for(int h:g){
        System.out.print((h)+" ");
      }
      System.out.println();
     }
   
     
     
    }
  }
