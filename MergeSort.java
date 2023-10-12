import java.util.Arrays;

public class MergeSort{
  public static void main(String[] args) {
    int[]arr={8,9,4,3,2,7,10};
    arr=merge(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static int[] merge(int[]arr)
  {
    if(arr.length==1)
    return arr;
    int mid=arr.length/2;
    int[]left_side=merge(Arrays.copyOfRange(arr, 0, mid));
     int[]right_side=merge(Arrays.copyOfRange(arr, mid,arr.length));
     return sort(left_side,right_side);
  }
  public static int[] sort(int[]left,int[]right)
  {
    int i=0;
    int j=0;
    int k=0;
    int[]mix=new int[left.length+right.length];
    while(i<left.length && j<right.length)
    {
      if(left[i]<right[j])
      {
        mix[k]=left[i];
        i++;
        k++;

      }
      else{
        mix[k]=right[j];
        j++;
        k++;
      }
    }
    while(i<left.length)
    {
      mix[k]=left[i];
      i++;
      k++;
    }
    while(j<right.length)
    {
      mix[k]=right[j];
      j++;
      k++;
    }
return mix;
  }
}