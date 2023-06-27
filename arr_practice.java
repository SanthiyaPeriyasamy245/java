
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class arr_practice{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    int[]arr= new int[5];
     for(int i=0;i<arr.length;i++)
     {
      arr[i]=sc.nextInt();
     }
     System.out.println(Arrays.toString(arr));
    //  enhanced for loops.
     for(int x:arr)
     {
      System.out.println(x);
     }
   
  String[]names=new String[5];
   for(int i=0;i<names.length;i++)
   {
    names[i]=sc.next();

   }
   System.out.println(Arrays.toString(names));
  
// 2d array
// {
//   {1,2,3}
//   {12,13,14}
//   {123,143,123}
// }
int i=0;
   int[][]nums=new int[3][3];
   for(i=0;i<nums.length;i++)
   {
    for(int j=0;j<nums[i].length;j++)
    {
      nums[i][j]=sc.nextInt();
    }
   }
   for(i=0;i<nums.length;i++){
    System.out.println(Arrays.toString(nums[i]));
   }
  //  enhanced for loop
//   for(int []y:nums)
// {
//   for(int k:y){

//     System.out.print(k);
//   }
//    System.out.println();
// }
for(int[]k:nums)
{
  System.out.println(Arrays.toString(k));
}
  }
}

