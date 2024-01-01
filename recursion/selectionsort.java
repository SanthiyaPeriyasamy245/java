import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int n, int[] arr) {
        if (n == 0) {
            return;
        } else {
            int maxindex = max(arr, n);
            int temp = arr[maxindex];
            arr[maxindex] = arr[n];
            arr[n] = temp;
            sort(n - 1, arr);
        }
    }

    public static int max(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
