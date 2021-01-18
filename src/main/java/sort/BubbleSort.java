package sort;

public class BubbleSort<T> implements Sort<T>{
    public T[] sort(T[] array) {
        return null;
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // Optimized bc it checks to see if array is sorted first
    public static int[] bubbleSortOptimized(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n ; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3,2,7,8,5};
        bubbleSortOptimized(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }



}
