import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class array_list {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    ArrayList<Integer>list=new ArrayList<>(1);
    list.add(5);
    list.add(3);
    System.out.println(list);
    ArrayList <ArrayList<Integer>>list1=new ArrayList<>();//nested arraylist.
    for(int i=0;i<3;i++)
    {
      list1.add(new ArrayList<>()); 
    }
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<5;j++)
      {
        list1.get(i).add(in.nextInt());
      }
    }
     System.out.println(list1);
     int []values={1,23,12,34,523,45};
     swap(values,1,3);
     System.out.println(Arrays.toString(values));
  }
  public static void swap(int[] arr,int index1,int index2)
  {
    int temp=arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
  }
}
