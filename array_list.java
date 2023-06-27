import java.util.Scanner;
import java.util.ArrayList;
public class array_list {
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  {
    ArrayList<Integer> list=new ArrayList<>(10);
    for(int i=0;i<10;i++)
    {
      list.add(sc.nextInt());
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(list.get(i));
    }
  }
  
}
}
