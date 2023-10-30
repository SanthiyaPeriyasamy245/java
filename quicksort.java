public class quicksort{
    public static void main(String[]args)
    {
        int[]arr={1,5,4,3,2};
        sort(arr,0,arr.length-1);
       for(int x:arr)
        {
            System.out.println(x);
        }
    
    }
    public static void sort(int[]arr,int l,int h)
    {
        if(l>=h)
        {
           return;
        }
        int s=l;
        int e=h;
        int m=s+(e-s)/2;
        int pivot=arr[m];
        while(s<=e)
        {
            while(arr[s]<pivot)
            {
                s++;

            }
            while(arr[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int t=arr[s];
                arr[s]=arr[e];
                arr[e]=t;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
    }
}