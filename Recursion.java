public class Recursion{
  /*
   recursion means a function call itself .
   whenever function get called it'll stored in stack when a function finishes it's execution it'll come out of the stack.
   space complexitiy not constant.

   */
  public static void main(String[] args) {
    int[]arr={1,2,3,4,6,7};
    int y=arr.length-1;
    int n=5;
    System.out.println(fibonaci(n));
    System.out.println(factorial(n));
    System.out.println(binarySearch(arr,0,y,n));
  }
  public static int fibonaci(int x) 
  {
    if(x<2)
    {
       return x;
    }
   
    int ans= fibonaci(x-1)+fibonaci(x-2);
    /*here fibonaci(4-1)+fibonacci(4-2)
    fibonacci(3)->fibonacci(2)+fibonaci(1)
    fibonaci(2)->fibonaci(1)+fibonaci(0)
   for fibonacci(1) it'll return 1 for fibonacci(0)->0
   hence for fibonaci(2) ->have 1 and fibonaci(1)->will have 1;
   then fibonaci(3)-> will have 2.similarly for rightside
   f(4)->f(3)+f(2)
   for f(3)
   f(3)->f(2)+f(1)
   f(2)->f(1)+f(0)
  for f(2)
  f(2)->f(1)+f(0)
  */
    return ans;
  }
  public static int factorial(int x){
 
 if(x==2) {
    return 2;
  }
  int ans=x*factorial(x-1);
  return ans;
}
public static int binarySearch(int[]arr,int s,int e,int x) {
  if(s>e)
  {
    return -1;
  }
  int mid=s+(e-s)/2;
  if(arr[mid]==x)
  return mid;
  else if(arr[mid]>x)
  {
    return binarySearch(arr, s, mid-1, x);
  }
  else{
    return binarySearch(arr, mid+1, e, x);
  }
}
}