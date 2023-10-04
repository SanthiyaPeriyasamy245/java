import java.util.*;
public class recursion_sample{
    public static void main(String[]args)
    {
        int []arr1={6,1,2,4,6,5,6};
        int[]arr={1,2,3,4,5};
       System.out.println( sort(arr,0));
       System.out.println(search(arr,3,0));
         search1(arr1,6,0);//find all index.
         System.out.println(list);
        ArrayList<Integer>list1=new ArrayList<>();
              System.out.println(  srch(arr1,6,0,list1));
       
    }
    public static boolean sort(int[]arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        return arr[i]<arr[i+1]&&sort(arr,i+1);

    }
    public static boolean search(int[]arr,int target,int i)
    {
        if(i==arr.length)
        {
            return false;

        }
        
        return arr[i]==target||search(arr,target,i+1);
    }
    static ArrayList<Integer>list=new ArrayList<>();
    public static void search1(int[]arr,int t,int i)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==t)
        {
            list.add(i);
        }
        search1(arr,t,i+1);


    }
    public static ArrayList<Integer> srch(int[]arr,int t,int i,ArrayList<Integer>list1)
    {
        if(i==arr.length)
        {
            return list1;
        }
        if(arr[i]==t)
        {
            list1.add(i);
        }
        return srch(arr,t,i+1,list1);
    }

    
    
}