public class LinearSearch_One{
  public static void main(String[] args) {
      int[]arr={1,2,3,4,5,6,7,8,9,12};
      int start=2;
      int end=7;
      int target=1;
      System.out.println(search4(arr,start,end,target));
      String str="Santhiya Periyasamy";
      char letter='S';
      System.out.println(search3(str.toCharArray(),letter));
     int index=search(arr,target);
     System.out.println(index);
     int value=search1(arr,target);
     System.out.println(value);
    System.out.println(search2(arr,target));
  }
  public static int search(int[]arr,int target)
  {
     if(arr.length==0)
      return -1;

       for(int i=0;i<arr.length;i++)
       {
       if(arr[i]==target)
        return i ;
       }
     return -1;  
}
public static int search1(int[]arr,int target)
{
  for(int i=0;i<arr.length;i++){
     if(arr[i]==target)
  return arr[i];
  }
  return Integer.MIN_VALUE;//maybe -1 will be in the array so we return random int value.
 
}
public static boolean search2(int[]arr,int target)
{
  for(int i=0;i<arr.length;i++){
     if(arr[i]==target)
  return true;
  }
  return false;
 
}
public static int search3(char[]arr,char target)
{
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]==target)
    return i;
  }
  return -1;
}
public static boolean search4(int[]arr,int start,int end,int target)
{
   for(int i=start;i<=end;i++)
 {
    if(arr[i]==target)
     return true;
 }
 return false;
}
}