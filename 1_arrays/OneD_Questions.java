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

    public static boolean containsDuplicate(int[] arr) {
        Sorting.mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void removeDuplicate(int[] arr) {
        Sorting.mergeSort(arr, 0, arr.length - 1);

        int j = 0; // points to position of last unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void removeDuplicateElements(int[] arr) {
        Sorting.mergeSort(arr, 0, arr.length - 1);

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            if (count == 1) {
                result.add(arr[i]);
            }
            i++;
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
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

        reversePos(arr, 0, size - 1);
        reversePos(arr, 0, (size - k) - 1);
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

    public static void mergeArrays(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] arr = new int[(arr1.length + arr2.length)];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        // left over array---------------
        // for arr1
        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        // for arr2
        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        printArr(arr);
    }

    public static void printSubarrays(int[] arr) {
        int size = arr.length;

        for (int si = 0; si < size; si++) {
            for (int ei = si; ei < size; ei++) {
                System.out.print("[");
                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k]);
                    if (k != ei) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }

    public static void maxSumSubarray(int[] arr) {
        int size = arr.length;
        int currSum, maxSum = Integer.MIN_VALUE;

        for (int si = 0; si < size; si++) {
            currSum = 0;
            for (int ei = si; ei < size; ei++) {
                currSum += arr[ei];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void kadanAlgo(int[] arr) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int ansStart = -1, ansEnd = -1, start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (currSum == 0) {
                start = i;
            }
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                ansStart = start;
                ansEnd = i;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.println(arr[i]);
        }
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

        // contains duplicate -----------------
        // containsDuplicate(arr3);

        // remove duplicate--------------------
        // removeDuplicate(arr6);

        // remove duplicate element from the array ----------------
        // removeDuplicateElements(arr6);

        // reverse array ---------------
        // reverseArr(arr);

        // right rotate array by k-------------------
        // rightRotateByk(arr1, sc.nextInt()); // back to front

        // left rotate array by k ------------------
        // leftRotateByk(arr5, sc.nextInt()); // front to back

        // merge 2 sorted arrays ------------------
        // mergeArrays(int[] arr5, int[] arr6);

        // find the difference of the sum of even and odd no. in array ---------------------
        // cal(arr);

        // move zeros to end -----------------
        // zeros(arr4);

        //merge 2 sorted arrays-----------------
        // mergeArrays(arr5, arr6);

        // print subarrays ------------------
        // printSubarrays(arr3);

        // max sum Subarray--------------
        // maxSumSubarray(arr3);
        
        // kadan's algorithm -----------------
        // kadanAlgo(arr3);
}
