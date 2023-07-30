public class binarySearchwithRecursion{
  public static void main(String[]args){
    
    int[]arr={2,3,4,5,6,7};
    int key=12;
    int n=find(0,arr.length-1,key,arr);
    System.out.println(n);
  }
  public static int find(int start,int end,int key,int arr[]){
    if(start>end)
      return -1;
    
      int mid=start+(end-start)/2;
      if(arr[mid]==key)
      return mid;
      if(arr[mid]>key){
        return find(start,mid-1,key,arr);
      }
      else
      return find(mid+1,end,key,arr);
      

  }
}