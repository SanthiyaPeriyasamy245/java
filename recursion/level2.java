import java.util.ArrayList;

public class level2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 18 };
        // check whether the array is sorted or not
        int[] arr1 = { 1, 2, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 1, 2, 3 };
        System.out.println(rotatedbinarySearch(arr, 0, arr2.length - 1, 5));
        System.out.println(noOfTimesPresent(arr1, 0, 2, new ArrayList<Integer>()));

        System.out.println(cheackAscendingOrder(0, arr));
        System.out.println(linearsearch(arr, 0, 17));
        System.out.println(newarrayCreation(arr1, 0, 2));
    }

    public static boolean rotatedbinarySearch(int[] arr, int s, int e, int target) {
        int mid = s + (e - s) / 2;
        if (s > e) {
            return false;
        } else if (arr[mid] == target) {
            return true;
        } else if (arr[s] <= target) {
            if (arr[s] <= arr[mid] && target < arr[mid]) {
                e = mid - 1;
                return rotatedbinarySearch(arr, s, e, target);
            } else {
                return rotatedbinarySearch(arr, mid + 1, e, target);
            }

        } else {
            return rotatedbinarySearch(arr, s, mid - 1, target);
        }
    }

    public static ArrayList<Integer> newarrayCreation(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> answer = newarrayCreation(arr, i + 1, target);
        list.addAll(answer);
        return list;

    }

    public static ArrayList noOfTimesPresent(int[] arr, int i, int target, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (target == arr[i]) {
            list.add(i);
        }
        return noOfTimesPresent(arr, i + 1, target, list);
    }

    public static boolean linearsearch(int[] arr, int i, int target) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || linearsearch(arr, i + 1, target);

    }

    public static boolean cheackAscendingOrder(int i, int[] arr) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && cheackAscendingOrder(i + 1, arr);

    }
}