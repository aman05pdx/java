public class CountSort {
    // getting max number from array
    static int getMax(int[] a, int n) {
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // count sort
    static void countingsort(int[] a, int n) {
        int[] output = new int[n + 1];
        int max = getMax(a, n);
        int[] count = new int[max + 1]; // creating count array with size m+1;
        for (int i = 0; i <= max; ++i) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[a[i]]++; // storing count of each element
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1]; // commulative frequency
        }

        // copying number after finding the count
        for (int i = n - 1; i >= 0; i--) {
            output[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }

        // storing sorted element in main array
        for (int i = 0; i < n; i++) {
            a[i] = output[i];
        }
    }

    static void printArray(int[] a) {
        System.out.println("Sorted array after using count sort:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] unsort = { 12, 43, 1, 4, 61, 51, 13 };
        countingsort(unsort,7);
        printArray(unsort);

    }
}