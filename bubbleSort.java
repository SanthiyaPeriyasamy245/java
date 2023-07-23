import java.util.Arrays;
public class bubbleSort{
  public static void main(String[]args)
  {
    int[]arr={3,4,5,1,2,0};
    //first maximum takes last position (n-1)steps
    sort(arr);
    System.out.println(Arrays.toString(arr));

  }
  public static void sort(int[]arr){
     for(int i=0;i<arr.length;i++)
     {
      boolean swapped=false;
      for(int j=1;j<arr.length-i;j++)
      {
        if(arr[j-1]>arr[j]){
          int temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
          swapped=true;

        }
        
      }
      if(swapped==false){
        break;
      }
     } 
  }
  
}
