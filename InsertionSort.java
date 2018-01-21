/**
 *  Insertion Sort.
 *  @author: himself
 */
public class InsertionSort {

    /**
     * Insertion Sort.
     */
    static int[] insertionSort(int[] arr) {
        int n = arr.length;
        int j, tmp;
        for(int i = 1; i < n; i++) {
            j = i;
            tmp = arr[j];
            while(j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 123, -123, -5, 10, 20, 21, -44, 54};
        int[] sorted = insertionSort(arr);
        for(int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}
