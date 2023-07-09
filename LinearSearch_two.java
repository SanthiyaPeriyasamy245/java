import java.util.Arrays;
public class LinearSearch_two {
  public static void main(String[] args) {
    int target=7;
    int[][]array={
      {1,2,3},
      {4,5,6},
      {7,8}
    };
    System.out.println(search(array,target));
   int[]arrays=search1(array,target);
   System.out.println(Arrays.toString(arrays));
    int[]arr={11,62,13,45,67,45,73,2,54,5};
    int m=arr[0];
    int minimum_value=min(arr,m);
    System.out.println(minimum_value);
    System.out.println(max(arr,m));
  }
  public static int min(int[]arr,int m)
  {
    
    for(int i=0;i<arr.length;i++)
    {
      
      if(arr[i]<m)
      m=arr[i];
    }
    
    return m;
  }
   public static int max(int[]arr,int m)
  {
    
    for(int i=0;i<arr.length;i++)
    {
      
      if(arr[i]>m)
      m=arr[i];
    }
    
    return m;
  }
  public static int search(int[][]arr,int target)
{
  for(int[] x:arr)
  {
    for(int y:x)
    {
      if(y==target)
      return y;
    }
  }
  return Integer.MIN_VALUE;
}
public static int[] search1(int[][]arr,int target)
{
  for(int i=0;i<arr.length;i++)
  {
    for(int j=0;j<arr[i].length;i++)
    {
      if(arr[i][j]==target)
      return new int[]{i,j};
    }
  }
  return null;
}


}
