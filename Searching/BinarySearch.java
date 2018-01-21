/**
 *  Binary Search.
 *  @author: himself
 */
public class BinarySearch {

    /**
     *  Iterative Binary Search.
     *  Time Complexity: O(lg(n))
     */
    static int iterBinSearch(int[] arr, int n) {
        int l = 0, r = arr.length - 1, mid;
        while(l <= r) {
            mid = (l + r) / 2;
            if(arr[mid] == n)
                return mid;
            if(arr[mid] < n)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    /**
     *  Recursive Binary Search.
     *  Time Complexity:  O(lg(n))
     */
    static int recurBinSearch(int[] arr, int n) {
        return recurBinSearch(arr, n, 0, arr.length - 1);
    }

    static int recurBinSearch(int[] arr, int n, int l, int r) {
        if(l <= r) {
            int mid = (l + r) / 2;
            if(arr[mid] == n)
                return mid;
            if(arr[mid] < n)
                return recurBinSearch(arr, n, mid + 1, r);
            else
                return recurBinSearch(arr, n, l, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        // System.out.println(recurBinSearch(arr, 5));
        // System.out.println(iterBinSearch(arr, 10));
    }
}
