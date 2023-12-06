// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
               String s="aabb";
               int count=0;
               for(int i=0;i<s.length();i++)
               {
                   if(ispalindrome(s.substring(i+1,s.length())))
                   {
                       break;
                   }
                   else {
                       count++;
                   }
        }
        System.out.println(count);
    }
    public static boolean ispalindrome(String s)
    {
        boolean b=true;
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length/2;i++)
        {

            if(arr[i]!=arr[arr.length-i-1]);
            {
                b=false;
                break;
            }
        }
        return b;
    }
}
