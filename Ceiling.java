public class Ceiling{

 public static void main(String []a)
   {
    int[]arr={12,13,14,15,17,18,20};
    int target=28;
    System.out.println(ceiling(arr,target));

      }
      public static int ceiling(int[]arr,int target)
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

        return arr[start%arr.length];
      }

   
}