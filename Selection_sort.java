import java.util.Arrays;
public class Selection_sort{
  public static void main(String[]args)
  {
    int[]arr={3,6,8,0,2,7,9,0,1};
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void sort(int[]arr){
    for(int i=0;i<arr.length;i++){
      int end=arr.length-i-1;
      int max=findmax(arr,0,end);
      int temp=arr[max];
      arr[max]=arr[end];
      arr[end]=temp;

    
    }
  }
  public static int findmax(int[]arr,int start,int end){
    int max=start;
    for(int i=start;i<=end;i++)
    {
     
     if(arr[max]<arr[i])  
     {
       max=i;
     }
      
    }
    return max;
  }
}