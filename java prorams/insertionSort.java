public class insertionSort {
    static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] unsorted = { 14, 23, 1, 23, 5, 2, 6, 24, 62, 2 };
        insertionsort(unsorted);
        print(unsorted);
    }
}
