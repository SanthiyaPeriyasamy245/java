import java.util.Arrays;

public class sortings{
    public static void main(String[] args) {
        int[]arr={1,3,5,6,7,8};
        int[]arr1={1,8,5,3,7};
        int[]arr2={1,13,5,16,17,8};
        int[]arr3={4,3,2,1,5};
       
        bubblesort(arr);
        selectionsort(arr1);
        insertionsort(arr2);
        cyclicsort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
    public static void bubblesort(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void selectionsort(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int maxindex=max(0,arr.length-i-1,arr);
            int temp=arr[maxindex];
            arr[maxindex]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }







    }
    public static int max(int s,int e,int[]arr)
    {
        int index=0;
        int max=0;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        return index;
    }
    public static void insertionsort(int[]arr)
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }
            }
        }
    }
    public static void cyclicsort(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int crctindex=arr[i]-1;
            if(crctindex!=i)
            {
                int t=arr[crctindex];
                arr[crctindex]=arr[i];
                arr[i]=t;
            }
        }
        
    }
}