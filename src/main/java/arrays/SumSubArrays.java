package arrays;

public class SumSubArrays {

    //Given an integer array ‘arr[]’, find sum of all sub-arrays of given array.
    // nested for loops innificient
    public static long sumArrays(int[] arr){
        long result = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = i; j < arr.length ; j++) {
                sum += arr[j];
                result += sum;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3} ;
        System.out.println("Sum of SubArray " + sumArrays(arr));
        // Should return 20
    }

}
