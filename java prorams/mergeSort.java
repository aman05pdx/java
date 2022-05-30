// import java.lang.reflect.Array;

public class mergeSort {
    static void merge(int[] A, int middle, int left, int right) {
        int[] leftTempArr = new int[middle - left + 2];
        int[] rightTempArr = new int[right - middle + 1];
        for (int i = 0; i <= middle - left; i++) {
            leftTempArr[i] = A[left + i];
        }
        for (int i = 0; i < right - middle; i++) {
            rightTempArr[i] = A[middle + 1 + i];
        }
        leftTempArr[middle - left + 1] = Integer.MAX_VALUE;
        rightTempArr[right - middle] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for (int k = left; k <= right; k++) {
            if (leftTempArr[i] < rightTempArr[j]) {
                A[k] = leftTempArr[i];
                i++;
            } else {
                A[k] = rightTempArr[j];
                j++;
            }
        }
    }

    static void mergesort(int[] arr, int left, int right) {
        if (right > left) {
            int m = (left + right) / 2;
            mergesort(arr, left, m);
            mergesort(arr, m + 1, right);
            merge(arr, m, left, right);
        }
    }

    static void printarr(int[] arr) {
        System.out.println("Sorting array using merge sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] unsort = { 23, 2, 5, 134, 52, 26, 23, 6, 3 };
        mergesort(unsort, 0, unsort.length - 1);
        printarr(unsort);
    }
}