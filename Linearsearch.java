public class Linearsearch {
  public static void main(String[] args) {
    String str="Santhiya";
    char t='n';
    System.out.println(search3(str,t));
    int[][]arr={{11,12,3},
    {4,5,69},
    {7,2,9}
    };
   System.out.println(search(arr));
    System.out.println(search1(arr));

  }
  public static int search(int[][]array)
  {
    int min=Integer.MAX_VALUE;
    for(int[]x:array)
    {
      for(int y:x)
        
      {
        if(y<min)
        min=y;
        
      }
    }
    return min;
  }
   public static int search1(int[][]array)
  {
    int max=Integer.MIN_VALUE;
    for(int[]x:array)
    {
      for(int y:x)
        
      {
        if(y>max)
        max=y;
        
      }
    }
    return max;
  }
public static boolean search3(String str,char t)
{
  for(int i=0;i<str.length();i++)
  {
    if(str.charAt(i)==t)
    return true;;
  }
  return false;
}

}
