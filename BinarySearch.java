public class  BinarySearch
{
    public static void main(String[] args)
  {
    int[]arr={12,11,10,9,8,7,6};
    int target=7;
    int result=binary_search(arr,target);
    System.out.println(result);

  }
public static int binary_search(int[]arr,int target)
{
 
  int start=0;
  int end=arr.length-1;
  boolean b=arr[start]<arr[end];
  int mid;
  

  while(start<=end)
  {
    mid=start+(end-start)/2;
       if(arr[mid]==target)
       {
        return mid;
       }
       
    if(b){ // for ascending.
       if(target>arr[mid])
    {
     start=mid+1;
    }
    else if(target<arr[mid])
    {
      end=mid-1;
    }
    }
    else{ //for descending.
         if(target>arr[mid])
    {
       end=mid-1;
    }
    else if(target<arr[mid])
    {
    
      start=mid+1;
    }
    }
  
   
  }
  return -1;
  
}
}