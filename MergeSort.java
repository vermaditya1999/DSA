/**
 *  MergeSort
 *  @author: himself
 */
public class MergeSort {

    /**
     * Merger Function.
     */
    static int[] merge(int[] a, int[] b) {
        int n1 = a.length, n2 = b.length;
        int[] arr = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {
            if(a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while(j < n2) {
            arr[k] = b[j];
            j++;
            k++;
        }

        return arr;
    }

    /**
     * MergeSort.
     */
    static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if(n == 1)
            return arr;
        int n1 = n / 2;
        int n2 = n - n1;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int k = 0;

        // Copy first half into a.
        for(int i = 0; i < n1; i++) {
            a[i] = arr[k];
            k++;
        }

        // Copy second half into b.
        for(int i = 0; i < n2; i++) {
            b[i] = arr[k];
            k++;
        }

        return merge(mergeSort(a), mergeSort(b));
    }

    public static void main(String[] args) {
        // int[] a = {-100, -100, 2,0,13,1, 10, 42, 924, -124, 4, -11};
        // int[] sorted = mergeSort(a);
        // for(int i = 0; i < sorted.length; i++)
        //     System.out.print(sorted[i] + " ");
    }
}
