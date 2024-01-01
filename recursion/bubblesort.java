
import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7, 6 };
        sort(0, 0, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int i, int j, int[] arr) {
        if (i == arr.length) {
            return;
        } else if (j == arr.length - i - 1) {
            sort(i + 1, 0, arr);
        } else if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            sort(i, j + 1, arr);
        } else {
            sort(i, j + 1, arr);
        }
    }
}