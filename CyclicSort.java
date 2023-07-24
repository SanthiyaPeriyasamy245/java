import java.util.Arrays;
public class CyclicSort{
  public static void main(String[]args){
    int[]arr={2,1,3};
    // if an array within a range of 0 to n or 1 to n we can easily sort using cyclic sort!
  
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void sort(int[]arr){
    int i=0;
    while(i<arr.length)
    { 
      int ans=arr[i]-1;
      if(ans!=i){
        int temp=arr[i];
        arr[i]=arr[ans];
        arr[ans]=temp;
      }
      else
      i++;

    }
  }
}