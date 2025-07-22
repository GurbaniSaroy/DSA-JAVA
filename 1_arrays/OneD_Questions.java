import java.util.*;

public class OneD_Questions {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void largestElements(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLarget = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLarget = largest;
                largest = num;
            } else if (num > secondLarget && num != largest) {
                secondLarget = num;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second-Largest: " + secondLarget);
    }

    public static void maxConsecutive(int[] arr) {
        int max = 0, currScore = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                currScore++;
                max = Math.max(max, currScore);
            } else {
                currScore = 1;
            }
        }
        System.out.println(max);
    }

    public static void findDuplicate(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }

    // public static void removeDuplicate(int[] arr){
    //     Sorting.mergeSort(arr, 0, arr.length-1);

    //     ArrayList<Integer> ans = new ArrayList<>();
    //     int j = 1;
    //     for(int i = 0; i < arr.length-1; i++){
    //         if(arr[i] != arr[j] && arr[i] != arr[i-1]){
    //             ans.add(arr[j]);
    //         }
    //         j++;
    //     }
    //     System.out.println(ans);
    }

    public static void reverseArr(int[] arr) {
        int si = 0, ei = arr.length - 1, temp = 0;
        while (si < ei) {
            temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            ei--;
            si++;
        }
        printArr(arr);
    }

    public static void reversePos(int[] arr, int si, int ei) {
        int temp = 0;
        while (si < ei) {
            temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void rightRotateByk(int[] nums, int k) {
        if (k == 0) {
            printArr(nums);
            return;
        }
        int size = nums.length;
        if (k > size) {
            k = k % size;
        } else if (k < 0) {
            k = ((k % size) + size) % size;
        }
        reversePos(nums, 0, size - 1);
        reversePos(nums, 0, k - 1);
        reversePos(nums, k, size - 1);
        printArr(nums);
    }

    public static void leftRotateByk(int[] arr, int k) {
        if (k == 0) {
            printArr(arr);
            return;
        }
        int size = arr.length;
        if (k > size) {
            k = k % size;
        } else if (k < 0) {
            k = ((k % size) + size) % size;
        }

        reversePos(arr, 0, size-1);
        reversePos(arr, 0, (size - k) -1);
        reversePos(arr, size - k, size - 1);

        printArr(arr);
    }

    public static void cal(int[] arr) {
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("Difference between evenSum & oddSum is:" + (evenSum - oddSum));
    }

    public static void zeros(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                arr[i - count] = arr[i];
            }
        }
        int ei = arr.length - 1;
        while (count > 0) {
            int i = ei - count + 1;
            arr[i] = 0;
            count--;
        }
        printArr(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // inputs----------------------
        int[] arr = { 1, 20, 4, 11, 34, 98, 23, 12, 45, 67, 45, 89, 67, 89 };
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
        int[] arr2 = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
        int[] arr3 = { 3, 1, 3, 4, 2 };
        int[] arr4 = { 1, 0, 19, 8, 12, 0, 56, 0, 0, 31 };
        int[] arr5 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr6 = { 2, 2, 4, 5, 10, 10, 10, 14, 17 };

        // find the largest and the second largest----------------
        // largestElements(arr);

        // maximum consecutive ones or zeros ------------------
        // maxConsecutive(arr1);

        // leetcode 287 -------------------------
        // findDuplicate(arr);

        //remove duplicate--------------------
        // removeDuplicate(arr6);

        // reverse array ---------------
        // reverseArr(arr);

        // right rotate array by k-------------------
        // rightRotateByk(arr1, sc.nextInt()); // back to front

        // left rotate array by k ------------------
        // leftRotateByk(arr5, sc.nextInt()); // front to back

        // merge 2 sorted arrays ------------------
        // mergeArrays(int[] arr5, int[] arr6);

        // find the difference of the sum of even and odd no. in array
        // ---------------------
        // cal(arr);

        // move zeros to end -----------------
        // zeros(arr4);
    }
}
