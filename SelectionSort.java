/**
 *  Selection Sort.
 *  @author: himself
 */
public class SelectionSort {

    /**
     * Selecton Sort.
     */
    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int min, mini, tmp;

        for(int i = 0; i < n; i++) {
            min = arr[i];
            mini = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    mini = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = {-100, 100, 213, 0, 2, 932, -132, -1, 4, 0};
        // int[] sorted = selectionSort(arr);
        // for(int i = 0; i < sorted.length; i++)
        //     System.out.print(sorted[i] + " ");
    }
}
