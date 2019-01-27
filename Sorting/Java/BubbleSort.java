/**
 *  Bubble Sort.
 *  @author: himself
 */
public class BubbleSort {

    /**
     * Bubble Sort.
     * Time Comlpexity: O(n^2)
     */
    static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int tmp;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = {12, -2, 0, 1, -213, 123, 47, -7, 10};
        // int[] sorted = bubbleSort(arr);
        // for(int i = 0; i < sorted.length; i++) {
        //     System.out.print(sorted[i] + " ");
        // }
    }
}
