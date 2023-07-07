

import java.util.Arrays;
import java.util.Scanner;
public class Array {
  public static void main(String[] args) {
    // arrays which stores same type of data.
    // in heap array obj are not  continuos in heap.it depands on jvm.
     int[]arr=new int[5];//dynamic memory allocation.
    //  int[]arr->works at compile time.new int[]->works at run time.in heap object get created.
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
      System.out.print("enter "+i+"th"+" element:");

      arr[i]=sc.nextInt();
    }
     System.out.println(Arrays.toString(arr));
  //enhanced for loop.
  for(int x:arr){
    System.out.println(x);
   
  }
  
  //2d array.
  int[][]array=new int[3][];
  array[0]=new int[3];
  array[1]=new int[2];
   array[2]=new int[1];
for(int i=0;i<array.length;i++){
  for(int j=0;j<array[i].length;j++)
  {  
     array[i][j]=sc.nextInt();
  }
}
for(int[]x:array)
{
  System.out.println(Arrays.toString(x));
}

  }
}