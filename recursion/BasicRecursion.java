public class BasicRecursion {
    public static void main(String[] args) {
        // basically recursion means function call itself if we want to do same
        // operation with different parameters we can use recursion.
        // function name going to be the same and parameters only going to change
        // example print number from 1 to 10 as well as 10 to 1.
        int n = 1;
        printNumbers(n);
        int x = 14;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(binarysearch(arr, 0, arr.length - 1, x));
        System.out.println(fibonacci(6));
        int val1 = 0;
        int val2 = 1;
        for (int i = 2; i <= 5; i++) {
            int temp = val1 + val2;
            val1 = val2;
            val2 = temp;
        }
        System.out.println(val2);

    }

    public static void printNumbers(int n) {
        if (n > 10) {
            // why we need this base condition?
            // the answer is when we call a function with different parameter it's going to
            // call another function infinitely so we need to tell the function when it
            // should be terminated or stop.
            return;
        }
        System.out.println(n); // here the numbers get printed first and call next one
        printNumbers(n + 1);
        System.out.println(n); // here function called before printing numbers so when function call ended and
                               // returned this will be executed.
        /*
         * Internally it'll be like
         * ( all function calls have a same body.)
         * for n=1
         * printNumbers(1)
         * {
         * sout(1)
         * printNumbers(2)
         * }
         * printNumbers(2)
         * {
         * sout(2)
         * printNumbers(3)
         * }
         * printNumbers(3)
         * {
         * sout(3)
         * printNumbers(4)
         * }
         * ...
         * ...
         * ...
         * printNumbers(11)
         * {
         * if(n>10) -> This condition becomes true and and it'll return nothing.then
         * removed from call stack and flow goes to where it was called.
         * }
         * 
         */

    }

    public static boolean binarysearch(int[] arr, int s, int e, int target) {
        int mid = s + (e - s) / 2;
        if (mid == target) {
            return true;
        } else if (s > e) {
            return false;
        }
        if (mid > target) {
            return binarysearch(arr, s, mid - 1, target);
        }

        else {
            return binarysearch(arr, mid + 1, e, target);
        }

    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
