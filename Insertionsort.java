import java.util.Arrays;
public class Insertionsort{
  public static void main(String[]args){
    int[]arr={0,8,7,1,5,3,9};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void sort(int[]arr){
    for(int i=0;i<=arr.length-2;i++)
    {
      for(int j=i+1;j>0;j--){
        if(arr[j-1]>arr[j])
        {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
        }
       
      else{
         break;
      }
     
      }
    }
  }
}