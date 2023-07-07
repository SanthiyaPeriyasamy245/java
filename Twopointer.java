import java.util.Arrays;
import java.util.Scanner;
public class Twopointer {

  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int[]array=new int[5];
    for(int i=0;i<array.length;i++)
    {
      array[i]=in.nextInt();
    }
     System.out.println(Arrays.toString(array));
    int end=(array.length)-1;
    int start=0;
    System.out.println(end);
    twopointer(array,start,end);
  System.out.println(Arrays.toString(array));
  }
  public static void twopointer(int[]arr,int start,int end)
  {
      while(start<end)
      {
        swap(arr,start,end);
        start++;
        end--;
      }
       
  }
  public static void swap(int []arr,int start,int end)
  {
      int temp=arr[end];
      arr[end]=arr[start];
      arr[start]=temp;
  }
}
