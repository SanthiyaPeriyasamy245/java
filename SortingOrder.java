public class SortingOrder{
  public static void main(String[] args) {
    int[]arr={5,4,8,2,1};
    int a=0;
    int d=0;
    for(int i=0;i<arr.length-1;i++)
    {
      if(arr[i]>arr[i+1])
      {
        a++;
      }
      else if(arr[i]<arr[i+1])
      {
        d++;
      }
    }
    if(a==0)
    {
      System.out.println("ascending Order");

    }
    else if(d==0)
    {
      System.out.println("descending Order");
    }
    else{
      System.out.println("neither ascending Nor descening");
    }
  }
}
