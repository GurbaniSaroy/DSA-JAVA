import java.util.*;

public class Sorting {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        int mid = 0;
        if (si < ei) {
            mid = si + ((ei - si) / 2);
            mergeSort(arr, si, mid); // left array
            mergeSort(arr, mid + 1, ei); // right array
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] ans = new int[(ei - si) + 1]; // new array
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }
        // --------------LEFTOVER ELEMENTS ---------------
        // left part
        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        // right part
        while (j <= ei) {
            ans[k++] = arr[j++];
        }

        for (k = 0, i = si; k < ans.length; k++, i++) {
            arr[i] = ans[k];
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 20, 4, 11, 34, 98, 23, 12, 45, 67, 45, 89, 67, 89 };
        Scanner sc = new Scanner(System.in); 

        // merge sort ----------------
        mergeSort(arr, 0, arr.length-1);
    }
}