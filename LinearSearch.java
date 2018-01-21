/**
 *  Linear Search.
 *  @author: himself
 */
public class LinearSearch {

    /**
     *  Linear Search.
     */
    static int linearSearch(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        // System.out.println(linearSearch(arr, 10));
        // System.out.println(linearSearch(arr, 3));
    }
}
