package search;

public class BinarySearch<T extends Comparable<T>> {

    //should return the index of the element found
    //return -1 if not found
    int search(T value, T[] array){
        return recursiveBinary(0, array.length, array, value);
        // return nonrecursiveBinary(array, value);
    }

    public int recursiveBinary(int left, int right, T[] array, T val) {
        int mid = (left + right) / 2;
        if (left == right) {
            return -1;
        } else if (array[mid].compareTo(val) == 0) {
            return mid;
        } else if (array[mid].compareTo(val) > 0) {
            return recursiveBinary(left + 1, mid, array, val);
        } else if (array[mid].compareTo(val) < 0) {
            return recursiveBinary(mid, right, array, val);
        }
        return -1;
    }

    public int nonrecursiveBinary(T[] array, T value){
        int left = 0;
        int right = array.length;
        int middle = left + (right-left) / 2;
        while(left <= right){
            if( array[middle].compareTo(value) == 0){
                return middle;
            } else if(array[middle].compareTo(value) > 0){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int nonrecursiveBS(int arr[], int x){
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                // Check if x is present at mid
                if (arr[m] == x)
                    return m;
                // If x greater, ignore left half
                else if (arr[m] < x)
                    l = m + 1;
                // If x is smaller, ignore right half
                else
                    r = m - 1;
            }
            // if we reach here, then element was not present
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(nonrecursiveBS(arr, 7));
    }


}


