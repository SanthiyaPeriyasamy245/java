public class floor{

 public static void main(String []a)
   {
    int[]arr={12,13,14,15,17,18,20};
    int target=13;
    System.out.println(floor_search(arr,target));

      }
      public static int floor_search(int[]arr,int target)
      {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
          int mid=start+(end-start)/2;
          
          if(arr[mid]>target)
          {
            end=mid-1;
          }
          
          else{
             start=mid+1;
          }
         
        }
        if(end==-1)
        return arr[0];
        else
        return arr[end];
      }

   
}