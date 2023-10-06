public class pattern{
    public static void main(String[]args)
    {
      print(4,0);
      int[]arr={8,9,10,4,3,2,1};
    sort(arr,0,0);
    for(int x:arr)
       {
        System.out.println(x);
       }
       int[]arr1={3,8,9,1};

       selectionsort(arr1,0);
    for(int x:arr1)
       {
        System.out.println(x);
       }
    }
    public static void print(int r,int c)
    {
       if(r==0)
       {
        return;
       }
        if(c<r)
        {


            System.out.print("*");
            print(r,c+1);
        }
        else{

           System.out.println();
           print(r-1,0);
        }
    }
    public static void sort(int[]arr,int i,int j)
    {
        if(i==arr.length-1)
        {
           return ;
        }
           
        
        if(j<arr.length-1)
        {
            if(arr[j]>arr[j+1])
            {
               int t=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=t;
            }
            sort(arr,i,j+1);
        }

            sort(arr,i+1,0);


    }
    public static void selectionsort(int[]arr,int i)
    {
        if(i==arr.length-1)
        {
            return;
        }
        int last=max(arr,0,arr.length-1-i);
        int t=arr[last];
        arr[last]=arr[arr.length-i-1];
        arr[arr.length-i-1]=t;
        selectionsort(arr,i+1);
    }
    public static int max(int[]arr,int s,int e)
    {
        int x=0;
        int m=0;
        for(int i=s;i<=e;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
                 x=i;
            }
        }
        return x;
    }
}