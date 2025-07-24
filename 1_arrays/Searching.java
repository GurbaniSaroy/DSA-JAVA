
import java.util.Scanner;

public class Searching {

    public static void binarySearch(int[] arr, int target) {
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + ((ei - si) / 2);

            if (arr[mid] == target) {
                System.out.println(mid + 1);
                return;
            } else if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { 2, 4, 5, 10, 15, 19, 24, 47, 54 };

        Scanner sc = new Scanner(System.in);

        // binary search --------------------
        binarySearch(arr2, sc.nextInt());
    }
}
