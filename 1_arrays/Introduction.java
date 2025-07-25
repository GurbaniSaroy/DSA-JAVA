// using ArrayList -------------------
import java.util.ArrayList;

// using utility arrays ------------------
// import java.util.Arrays;

public class Introduction {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArr2(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {

        // ======================= METHODS OF DECLARING & INITIALIZING
        // ========================
        // declaring array -------------------
        int[] arr; // Preferred
        int arr1[]; // Also allowed

        // declaring & initializing ---------------
        int[] arr2 = new int[5]; // all elements set default to 0

        // declare & initialize with values ---------------
        int[] arr3 = { 1, 2, 3, 4, 5 };

        // declare first then assign later ---------------
        int[] arr4;
        arr4 = new int[] { 10, 20, 30 };

        // creating multi-dimensional arrays ----------------------
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns

        // multi-dimensional array with values ----------------------
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // jagged arrays (array of arrays with different lengths) ----------------
        int[][] jagged = new int[3][];
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[1];

        // using utility arrays----------------------
        int[] arr5 = new int[5];
        // Arrays.fill(arr5, 1); // fills all elements with 1

        // using ArrayList -----------------------------
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);

        // ==================== PRINTING ARRAYS ========================
        printArr(arr4);
        printArr2(arr4);
    }
}
