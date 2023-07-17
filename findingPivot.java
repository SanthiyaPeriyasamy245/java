public class findingPivot{
  public static void main(String[]args)
  { 
    
    int[]arr={5, 6, 7, 8, 9, 10, 1, 2, 3};
    System.out.println(pivot(arr));
   

  }

public static int pivot(int[]arr)
{
  int start=0;
  int end=arr.length-1;
  int mid=0;
  while(start<end)
  {
    mid=start+(end-start)/2;
    if(arr[mid]>arr[mid+1])
    {
      end=mid;
    }
    else if(arr[mid-1]>arr[mid])
    {
      end=mid-1;
    }
    else
    {
      start=mid+1;
    }
  }
   return start;
  }
 
}
